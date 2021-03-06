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

package erki.xpeter.util;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;

import erki.xpeter.parsers.WhereAmI;
import erki.xpeter.parsers.rss.FeedData;
import erki.xpeter.parsers.rss.RssFeed;
import erki.xpeter.parsers.sms.ShortMessage;
import erki.xpeter.parsers.sms.SimpleMailbox;
import erki.xpeter.parsers.statistics.Statistics;
import erki.xpeter.parsers.statistics.User;

/**
 * This enum contains constants that can be used to store information in the persistent storage
 * file. A parser should not use the storage keys of other parsers but rather create its own.
 * 
 * @author Edgar Kalkowski
 */
public enum Keys {
    
    /**
     * A {@link TreeMap}&lt;{@link String}, {@link LinkedList}&lt;{@link ShortMessage}&gt;&gt; that
     * contains the short messages stored by {@link SimpleMailbox}.
     */
    SHORT_MESSAGES,
    
    /**
     * This {@link TreeMap}&lt;{@link String}, {@link LinkedList}&lt;{@link FeedData}&gt;&gt;
     * contains all the feed urls known to {@link RssFeed} together with additional information
     * about the feeds.
     */
    RSS_FEEDS,
    
    /**
     * This {@link TreeMap}&lt;{@link String}, {@link String}&gt; contains the known whereabouts of
     * chat participants (used by {@link WhereAmI}).
     */
    WHEREABOUTS,
    
    /**
     * This {@link TreeMap}&lt;{@link String}, {@link User}&gt; contains statistical information
     * about the participants of chats. See the {@link Statistics} parser for more details.
     */
    STATISTICS,
    
    /**
     * This {@link TreeMap}&lt;{@link String}, {@link HashSet}&lt;{@link String}&gt;&gt; contains
     * personal favourite meals of people.
     */
    MEALS,
    
    /** This {@link String} is the currently configured nickname of Tobi. */
    TOBIS_NICK,
    
    /**
     * @deprecated Will be removed in a future version. If any storage contains something under this
     *             key it should be dropped or stored under another key!
     */
    @Deprecated
    SOCCER_THREADS
}
