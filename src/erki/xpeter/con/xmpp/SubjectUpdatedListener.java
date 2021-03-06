/*
 * © Copyright 2008–2010 by Edgar Kalkowski <eMail@edgar-kalkowski.de>
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

package erki.xpeter.con.xmpp;

import erki.api.util.Log;

/**
 * This listener is used in {@link XmppConnection} and called every time the subject (topic) of the
 * chat is updated.
 * 
 * @author Edgar Kalkowski
 */
public class SubjectUpdatedListener implements org.jivesoftware.smackx.muc.SubjectUpdatedListener {
    
    @Override
    public void subjectUpdated(String subject, String from) {
        Log.debug("The chat’s subject changed from “" + from + "” to “" + subject + "”.");
    }
}
