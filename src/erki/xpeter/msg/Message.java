/*
 * © Copyright 2008–2009 by Edgar Kalkowski (eMail@edgar-kalkowski.de)
 * 
 * This file is part of the chatbot xpeter.
 * 
 * The chatbot xpeter is free software; you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If
 * not, see <http://www.gnu.org/licenses/>.
 */

package erki.xpeter.msg;

import erki.xpeter.con.Connection;
import erki.xpeter.parsers.Parser;

/**
 * Superclass for all messages that can be processed by xpeter. It assumes that every message at
 * least contains some text. The text that this class contains is immutable. Just create a new
 * instance if needed. This class also contains the {@link Connection} over which this message was
 * received so the {@link Parser}s can easily create response messages.
 * <p>
 * Known subclasses: {@link TextMessage}
 * 
 * @author Edgar Kalkowski
 */
public class Message {
    
    private Connection connection;
    
    private String text;
    
    /**
     * Create a new Message object.
     * 
     * @param text
     *        The text of the new message.
     * @param connection
     *        The connection over which the text was received.
     */
    public Message(String text, Connection connection) {
        this.connection = connection;
        this.text = text;
    }
    
    /**
     * Create a new Message without an associated {@link Connection}. This can be useful if creating
     * response messages in some parser but it may also be harmful if a connection accidentally
     * creates messages using this constructor that are later processed by parsers that rely on the
     * connection information.
     * 
     * @param text
     *        The text of the new message.
     */
    public Message(String text) {
        this(text, null);
    }
    
    /**
     * Access the wrapped text of the message.
     * 
     * @return The text of the message.
     */
    public String getText() {
        return text;
    }
    
    /**
     * Access the connection over which this message was received. This is useful for {@link Parser}
     * s that want to build response messages.
     * 
     * @return The connection instance over which this message was received.
     */
    public Connection getConnection() {
        return connection;
    }
    
    @Override
    public String toString() {
        return "Message(“" + text + "”)";
    }
}