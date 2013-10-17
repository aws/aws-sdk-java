/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * The .jpg or .png file associated with an audio file.
 * </p>
 */
public class JobAlbumArt implements Serializable {

    /**
     * A policy that determines how Elastic Transcoder will handle the
     * existence of multiple album artwork files. <p> <ul>
     * <li><code>Replace:</code> The specified album art will replace any
     * existing album art.</li> <li><code>Prepend:</code> The specified album
     * art will be placed in front of any existing album art.</li>
     * <li><code>Append:</code> The specified album art will be placed after
     * any existing album art.</li> <li><code>Fallback:</code> If the
     * original input file contains artwork, Elastic Transcoder will use that
     * artwork for the output. If the original input does not contain
     * artwork, Elastic Transcoder will use the specified album art
     * file.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Replace$)|(^Prepend$)|(^Append$)|(^Fallback$)<br/>
     */
    private String mergePolicy;

    /**
     * The file to be used as album art. There can be multiple artworks
     * associated with an audio file, to a maximum of 20. Valid formats are
     * <code>.jpg</code> and <code>.png</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Artwork> artwork;

    /**
     * A policy that determines how Elastic Transcoder will handle the
     * existence of multiple album artwork files. <p> <ul>
     * <li><code>Replace:</code> The specified album art will replace any
     * existing album art.</li> <li><code>Prepend:</code> The specified album
     * art will be placed in front of any existing album art.</li>
     * <li><code>Append:</code> The specified album art will be placed after
     * any existing album art.</li> <li><code>Fallback:</code> If the
     * original input file contains artwork, Elastic Transcoder will use that
     * artwork for the output. If the original input does not contain
     * artwork, Elastic Transcoder will use the specified album art
     * file.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Replace$)|(^Prepend$)|(^Append$)|(^Fallback$)<br/>
     *
     * @return A policy that determines how Elastic Transcoder will handle the
     *         existence of multiple album artwork files. <p> <ul>
     *         <li><code>Replace:</code> The specified album art will replace any
     *         existing album art.</li> <li><code>Prepend:</code> The specified album
     *         art will be placed in front of any existing album art.</li>
     *         <li><code>Append:</code> The specified album art will be placed after
     *         any existing album art.</li> <li><code>Fallback:</code> If the
     *         original input file contains artwork, Elastic Transcoder will use that
     *         artwork for the output. If the original input does not contain
     *         artwork, Elastic Transcoder will use the specified album art
     *         file.</li> </ul>
     */
    public String getMergePolicy() {
        return mergePolicy;
    }
    
    /**
     * A policy that determines how Elastic Transcoder will handle the
     * existence of multiple album artwork files. <p> <ul>
     * <li><code>Replace:</code> The specified album art will replace any
     * existing album art.</li> <li><code>Prepend:</code> The specified album
     * art will be placed in front of any existing album art.</li>
     * <li><code>Append:</code> The specified album art will be placed after
     * any existing album art.</li> <li><code>Fallback:</code> If the
     * original input file contains artwork, Elastic Transcoder will use that
     * artwork for the output. If the original input does not contain
     * artwork, Elastic Transcoder will use the specified album art
     * file.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Replace$)|(^Prepend$)|(^Append$)|(^Fallback$)<br/>
     *
     * @param mergePolicy A policy that determines how Elastic Transcoder will handle the
     *         existence of multiple album artwork files. <p> <ul>
     *         <li><code>Replace:</code> The specified album art will replace any
     *         existing album art.</li> <li><code>Prepend:</code> The specified album
     *         art will be placed in front of any existing album art.</li>
     *         <li><code>Append:</code> The specified album art will be placed after
     *         any existing album art.</li> <li><code>Fallback:</code> If the
     *         original input file contains artwork, Elastic Transcoder will use that
     *         artwork for the output. If the original input does not contain
     *         artwork, Elastic Transcoder will use the specified album art
     *         file.</li> </ul>
     */
    public void setMergePolicy(String mergePolicy) {
        this.mergePolicy = mergePolicy;
    }
    
    /**
     * A policy that determines how Elastic Transcoder will handle the
     * existence of multiple album artwork files. <p> <ul>
     * <li><code>Replace:</code> The specified album art will replace any
     * existing album art.</li> <li><code>Prepend:</code> The specified album
     * art will be placed in front of any existing album art.</li>
     * <li><code>Append:</code> The specified album art will be placed after
     * any existing album art.</li> <li><code>Fallback:</code> If the
     * original input file contains artwork, Elastic Transcoder will use that
     * artwork for the output. If the original input does not contain
     * artwork, Elastic Transcoder will use the specified album art
     * file.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Replace$)|(^Prepend$)|(^Append$)|(^Fallback$)<br/>
     *
     * @param mergePolicy A policy that determines how Elastic Transcoder will handle the
     *         existence of multiple album artwork files. <p> <ul>
     *         <li><code>Replace:</code> The specified album art will replace any
     *         existing album art.</li> <li><code>Prepend:</code> The specified album
     *         art will be placed in front of any existing album art.</li>
     *         <li><code>Append:</code> The specified album art will be placed after
     *         any existing album art.</li> <li><code>Fallback:</code> If the
     *         original input file contains artwork, Elastic Transcoder will use that
     *         artwork for the output. If the original input does not contain
     *         artwork, Elastic Transcoder will use the specified album art
     *         file.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobAlbumArt withMergePolicy(String mergePolicy) {
        this.mergePolicy = mergePolicy;
        return this;
    }

    /**
     * The file to be used as album art. There can be multiple artworks
     * associated with an audio file, to a maximum of 20. Valid formats are
     * <code>.jpg</code> and <code>.png</code>
     *
     * @return The file to be used as album art. There can be multiple artworks
     *         associated with an audio file, to a maximum of 20. Valid formats are
     *         <code>.jpg</code> and <code>.png</code>
     */
    public java.util.List<Artwork> getArtwork() {
        if (artwork == null) {
              artwork = new com.amazonaws.internal.ListWithAutoConstructFlag<Artwork>();
              artwork.setAutoConstruct(true);
        }
        return artwork;
    }
    
    /**
     * The file to be used as album art. There can be multiple artworks
     * associated with an audio file, to a maximum of 20. Valid formats are
     * <code>.jpg</code> and <code>.png</code>
     *
     * @param artwork The file to be used as album art. There can be multiple artworks
     *         associated with an audio file, to a maximum of 20. Valid formats are
     *         <code>.jpg</code> and <code>.png</code>
     */
    public void setArtwork(java.util.Collection<Artwork> artwork) {
        if (artwork == null) {
            this.artwork = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Artwork> artworkCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Artwork>(artwork.size());
        artworkCopy.addAll(artwork);
        this.artwork = artworkCopy;
    }
    
    /**
     * The file to be used as album art. There can be multiple artworks
     * associated with an audio file, to a maximum of 20. Valid formats are
     * <code>.jpg</code> and <code>.png</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param artwork The file to be used as album art. There can be multiple artworks
     *         associated with an audio file, to a maximum of 20. Valid formats are
     *         <code>.jpg</code> and <code>.png</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobAlbumArt withArtwork(Artwork... artwork) {
        if (getArtwork() == null) setArtwork(new java.util.ArrayList<Artwork>(artwork.length));
        for (Artwork value : artwork) {
            getArtwork().add(value);
        }
        return this;
    }
    
    /**
     * The file to be used as album art. There can be multiple artworks
     * associated with an audio file, to a maximum of 20. Valid formats are
     * <code>.jpg</code> and <code>.png</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param artwork The file to be used as album art. There can be multiple artworks
     *         associated with an audio file, to a maximum of 20. Valid formats are
     *         <code>.jpg</code> and <code>.png</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobAlbumArt withArtwork(java.util.Collection<Artwork> artwork) {
        if (artwork == null) {
            this.artwork = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Artwork> artworkCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Artwork>(artwork.size());
            artworkCopy.addAll(artwork);
            this.artwork = artworkCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMergePolicy() != null) sb.append("MergePolicy: " + getMergePolicy() + ",");
        if (getArtwork() != null) sb.append("Artwork: " + getArtwork() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMergePolicy() == null) ? 0 : getMergePolicy().hashCode()); 
        hashCode = prime * hashCode + ((getArtwork() == null) ? 0 : getArtwork().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobAlbumArt == false) return false;
        JobAlbumArt other = (JobAlbumArt)obj;
        
        if (other.getMergePolicy() == null ^ this.getMergePolicy() == null) return false;
        if (other.getMergePolicy() != null && other.getMergePolicy().equals(this.getMergePolicy()) == false) return false; 
        if (other.getArtwork() == null ^ this.getArtwork() == null) return false;
        if (other.getArtwork() != null && other.getArtwork().equals(this.getArtwork()) == false) return false; 
        return true;
    }
    
}
    