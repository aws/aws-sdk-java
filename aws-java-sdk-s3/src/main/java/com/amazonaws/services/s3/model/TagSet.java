/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class TagSet implements Serializable {
	private Map<String, String> tags;
	
	/**
     * <p>
     * Creates a new empty TagSet.
     * </p>
     * 
     * @see TagSet#TagSet(Map)
     */
	public TagSet() {
        this.tags = new LinkedHashMap<String, String>( 1 );
    }
    
	/**
	 * <p>
	 * Creates a new TagSet with the set of tags defined.
	 * </p>
	 * @param tags
	 * 			A key/value mapping of tags to store in this <code>TagSet</code>
	 */
    public TagSet( Map<String, String> tags ) {
        this.tags = new LinkedHashMap<String, String>( 1 );
        this.tags.putAll( tags );
    }
    
    /**
     * <p>
     * Get the value of the tag with the given key.
     * </p>
     * @param key
     * 			The key of the tag to return
     * @return The value of the given tag.  Will return null if no tag by the
     * 			given key exists.
     */
    public String getTag( String key ) {
    	return tags.get( key );
    }
    
    /**
     * <p>
     * Sets the value of the tag for a given key.  Will overwrite existing value.
     * </p>
     * @param key
     * 			The key for the tag
     * @param value
     * 			The value for the tag
     */
    public void setTag( String key, String value ) {
    	tags.put( key, value );
    }
    
    /**
     * <p>
     * Get all the tags for this <code>TagSet</code>
     * </p>
     * @return A map of key/value for all tags
     */
    public Map<String, String> getAllTags() {
    	return tags;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("Tags: " + this.getAllTags() );
        sb.append("}");
        return sb.toString();
    }
}
