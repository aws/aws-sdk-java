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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.amazonaws.services.s3.AmazonS3;

public class BucketTaggingConfiguration implements Serializable {

    private List<TagSet> tagSets = null;

    /**
     * <p>
     * Creates a new bucket tagging configuration.
     * By default, the newly created configuration is empty.
     * </p>
     * <p>
     * Passing the new configuration directly to
     * {@link AmazonS3#setBucketTaggingConfiguration(String,BucketTaggingConfiguration)}
     * will remove any existing bucket tagging configuration.
     * </p>
     * 
     * @see BucketTaggingConfiguration#BucketTaggingConfiguration(Collection)
     */
    public BucketTaggingConfiguration() {
        this.tagSets = new ArrayList<TagSet>( 1 );
    }
    
    /**
     * <p>
     * Creates a new bucket Tagging configuration containing the specified 
     * <code>TopicConfigurations</code>.
     * </p>
     * <p>
     * Passing the new configuration directly to
     * {@link AmazonS3#setBucketTaggingConfiguration(String,BucketTaggingConfiguration)}
     * will set the bucket's Tagging configuration and overwrite any existing configuration.
     * </p>
     * 
     * @see BucketTaggingConfiguration#BucketTaggingConfiguration()
     */
    public BucketTaggingConfiguration( Collection<TagSet> tagSets ) {
        this.tagSets = new ArrayList<TagSet>( 1 );
        this.tagSets.addAll( tagSets );
    }

    /**
     * <p>
     * Sets the {@link TagSet}
     * <code>TagSets</code> and returns this object,
     * enabling additional method calls to be chained together.
     * </p>
     * <p>
     * Calling this method will overwrite any 
     * previously set <code>TagSets</code> for this object.
     * </p>
     * 
     * @param tagSets
     *            A set of TagSet objects.
     * 
     * @return The updated {@link BucketTaggingConfiguration} object,
     * 		   enabling additional method calls to be chained together.
     * 
     * @see BucketTaggingConfiguration#setTagSets(Collection)
     */
    public BucketTaggingConfiguration withTagSets( TagSet... tagSets ) {
        this.tagSets.clear();
        
        for ( int index = 0; index < tagSets.length; index++ ) {
            this.tagSets.add( tagSets[ index ] );
        }
        
        return this;
    }

    /**
     * <p>
     * Sets the {@link TagSet}.
     * </p>
     * <p>
     * Calling this method will overwrite any 
     * previously set <code>TagSets</code> for this object.
     * </p>
     * 
     * @param tagSets
     *            A collection of TagSet objects.
     *            
     * @see BucketTaggingConfiguration#withTagSets(TagSet...)
     */
    public void setTagSets( Collection<TagSet> tagSets ) {
        this.tagSets.clear();
        this.tagSets.addAll( tagSets );
    }

    /**
     * <p>
     * Gets the list of {@link TagSet} objects
     * contained in this object. This method may return an empty list if no <code>TagSet</code>
     * objects are present.
     * </p>
     * 
     * @return The list of <code>TagSet</code> objects contained in this object.
     *   May return an empty list.
     */
    public List<TagSet> getAllTagSets() {
        return this.tagSets;
    }

    /** 
     * <p>
     * Gets the first {@link TagSet} object contained in this object. This method may return null
     * list if no <code>TagSet</code> objects are present.
     * </p>
     * @return The first <code>TagSet</code> object contained in the object
     */
    public TagSet getTagSet() {
    	return this.tagSets.get( 0 );
    }
    
    /** 
     * <p>
     * Gets the {@link TagSet} object at the specified index contained in this object.
     * </p>
     * 
     * @param index
     * 			The index of the <code>TagSet</code> object to return
     * 
     * @return The <code>TagSet</code> object contained in the object
     */
    public TagSet getTagSetAtIndex( int index ) {
    	return this.tagSets.get( index );
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("TagSets: " + this.getAllTagSets() );
        sb.append("}");
        return sb.toString();
    }
    
}
