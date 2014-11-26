/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A source file for the input sidecar captions used during the
 * transcoding process.
 * </p>
 */
public class CaptionSource implements Serializable {

    /**
     * The name of the sidecar caption file that you want Elastic Transcoder
     * to include in the output file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String key;

    /**
     * A string that specifies the language of the caption. Specify this as
     * one of: <ul> <li><p>2-character ISO 639-1 code</li> <li><p>3-character
     * ISO 639-2 code</li> </ul> <p>For more information on ISO language
     * codes and language names, see the List of ISO 639-1 codes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String language;

    /**
     * For clip generation or captions that do not start at the same time as
     * the associated video file, the <code>TimeOffset</code> tells Elastic
     * Transcoder how much of the video to encode before including captions.
     * <p>Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[+-]?\d{1,5}(\.\d{0,3})?$)|(^[+-]?([0-1]?[0-9]:|2[0-3]:)?([0-5]?[0-9]:)?[0-5]?[0-9](\.\d{0,3})?$)<br/>
     */
    private String timeOffset;

    /**
     * The label of the caption shown in the player when choosing a language.
     * We recommend that you put the caption language name here, in the
     * language of the captions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String label;

    /**
     * The encryption settings, if any, that you want Elastic Transcoder to
     * apply to your caption sources.
     */
    private Encryption encryption;

    /**
     * The name of the sidecar caption file that you want Elastic Transcoder
     * to include in the output file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name of the sidecar caption file that you want Elastic Transcoder
     *         to include in the output file.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The name of the sidecar caption file that you want Elastic Transcoder
     * to include in the output file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param key The name of the sidecar caption file that you want Elastic Transcoder
     *         to include in the output file.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The name of the sidecar caption file that you want Elastic Transcoder
     * to include in the output file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param key The name of the sidecar caption file that you want Elastic Transcoder
     *         to include in the output file.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaptionSource withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * A string that specifies the language of the caption. Specify this as
     * one of: <ul> <li><p>2-character ISO 639-1 code</li> <li><p>3-character
     * ISO 639-2 code</li> </ul> <p>For more information on ISO language
     * codes and language names, see the List of ISO 639-1 codes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return A string that specifies the language of the caption. Specify this as
     *         one of: <ul> <li><p>2-character ISO 639-1 code</li> <li><p>3-character
     *         ISO 639-2 code</li> </ul> <p>For more information on ISO language
     *         codes and language names, see the List of ISO 639-1 codes.
     */
    public String getLanguage() {
        return language;
    }
    
    /**
     * A string that specifies the language of the caption. Specify this as
     * one of: <ul> <li><p>2-character ISO 639-1 code</li> <li><p>3-character
     * ISO 639-2 code</li> </ul> <p>For more information on ISO language
     * codes and language names, see the List of ISO 639-1 codes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param language A string that specifies the language of the caption. Specify this as
     *         one of: <ul> <li><p>2-character ISO 639-1 code</li> <li><p>3-character
     *         ISO 639-2 code</li> </ul> <p>For more information on ISO language
     *         codes and language names, see the List of ISO 639-1 codes.
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
    /**
     * A string that specifies the language of the caption. Specify this as
     * one of: <ul> <li><p>2-character ISO 639-1 code</li> <li><p>3-character
     * ISO 639-2 code</li> </ul> <p>For more information on ISO language
     * codes and language names, see the List of ISO 639-1 codes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param language A string that specifies the language of the caption. Specify this as
     *         one of: <ul> <li><p>2-character ISO 639-1 code</li> <li><p>3-character
     *         ISO 639-2 code</li> </ul> <p>For more information on ISO language
     *         codes and language names, see the List of ISO 639-1 codes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaptionSource withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * For clip generation or captions that do not start at the same time as
     * the associated video file, the <code>TimeOffset</code> tells Elastic
     * Transcoder how much of the video to encode before including captions.
     * <p>Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[+-]?\d{1,5}(\.\d{0,3})?$)|(^[+-]?([0-1]?[0-9]:|2[0-3]:)?([0-5]?[0-9]:)?[0-5]?[0-9](\.\d{0,3})?$)<br/>
     *
     * @return For clip generation or captions that do not start at the same time as
     *         the associated video file, the <code>TimeOffset</code> tells Elastic
     *         Transcoder how much of the video to encode before including captions.
     *         <p>Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     */
    public String getTimeOffset() {
        return timeOffset;
    }
    
    /**
     * For clip generation or captions that do not start at the same time as
     * the associated video file, the <code>TimeOffset</code> tells Elastic
     * Transcoder how much of the video to encode before including captions.
     * <p>Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[+-]?\d{1,5}(\.\d{0,3})?$)|(^[+-]?([0-1]?[0-9]:|2[0-3]:)?([0-5]?[0-9]:)?[0-5]?[0-9](\.\d{0,3})?$)<br/>
     *
     * @param timeOffset For clip generation or captions that do not start at the same time as
     *         the associated video file, the <code>TimeOffset</code> tells Elastic
     *         Transcoder how much of the video to encode before including captions.
     *         <p>Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     */
    public void setTimeOffset(String timeOffset) {
        this.timeOffset = timeOffset;
    }
    
    /**
     * For clip generation or captions that do not start at the same time as
     * the associated video file, the <code>TimeOffset</code> tells Elastic
     * Transcoder how much of the video to encode before including captions.
     * <p>Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^[+-]?\d{1,5}(\.\d{0,3})?$)|(^[+-]?([0-1]?[0-9]:|2[0-3]:)?([0-5]?[0-9]:)?[0-5]?[0-9](\.\d{0,3})?$)<br/>
     *
     * @param timeOffset For clip generation or captions that do not start at the same time as
     *         the associated video file, the <code>TimeOffset</code> tells Elastic
     *         Transcoder how much of the video to encode before including captions.
     *         <p>Specify the TimeOffset in the form [+-]SS.sss or [+-]HH:mm:SS.ss.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaptionSource withTimeOffset(String timeOffset) {
        this.timeOffset = timeOffset;
        return this;
    }

    /**
     * The label of the caption shown in the player when choosing a language.
     * We recommend that you put the caption language name here, in the
     * language of the captions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return The label of the caption shown in the player when choosing a language.
     *         We recommend that you put the caption language name here, in the
     *         language of the captions.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * The label of the caption shown in the player when choosing a language.
     * We recommend that you put the caption language name here, in the
     * language of the captions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param label The label of the caption shown in the player when choosing a language.
     *         We recommend that you put the caption language name here, in the
     *         language of the captions.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * The label of the caption shown in the player when choosing a language.
     * We recommend that you put the caption language name here, in the
     * language of the captions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param label The label of the caption shown in the player when choosing a language.
     *         We recommend that you put the caption language name here, in the
     *         language of the captions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaptionSource withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * The encryption settings, if any, that you want Elastic Transcoder to
     * apply to your caption sources.
     *
     * @return The encryption settings, if any, that you want Elastic Transcoder to
     *         apply to your caption sources.
     */
    public Encryption getEncryption() {
        return encryption;
    }
    
    /**
     * The encryption settings, if any, that you want Elastic Transcoder to
     * apply to your caption sources.
     *
     * @param encryption The encryption settings, if any, that you want Elastic Transcoder to
     *         apply to your caption sources.
     */
    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }
    
    /**
     * The encryption settings, if any, that you want Elastic Transcoder to
     * apply to your caption sources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encryption The encryption settings, if any, that you want Elastic Transcoder to
     *         apply to your caption sources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaptionSource withEncryption(Encryption encryption) {
        this.encryption = encryption;
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
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getLanguage() != null) sb.append("Language: " + getLanguage() + ",");
        if (getTimeOffset() != null) sb.append("TimeOffset: " + getTimeOffset() + ",");
        if (getLabel() != null) sb.append("Label: " + getLabel() + ",");
        if (getEncryption() != null) sb.append("Encryption: " + getEncryption() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode()); 
        hashCode = prime * hashCode + ((getTimeOffset() == null) ? 0 : getTimeOffset().hashCode()); 
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode()); 
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CaptionSource == false) return false;
        CaptionSource other = (CaptionSource)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getLanguage() == null ^ this.getLanguage() == null) return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false) return false; 
        if (other.getTimeOffset() == null ^ this.getTimeOffset() == null) return false;
        if (other.getTimeOffset() != null && other.getTimeOffset().equals(this.getTimeOffset()) == false) return false; 
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        if (other.getEncryption() == null ^ this.getEncryption() == null) return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false) return false; 
        return true;
    }
    
}
    