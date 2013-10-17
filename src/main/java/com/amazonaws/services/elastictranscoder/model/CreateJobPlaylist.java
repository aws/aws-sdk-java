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
 * Information about the master playlist.
 * </p>
 */
public class CreateJobPlaylist implements Serializable {

    /**
     * The name that you want Elastic Transcoder to assign to the master
     * playlist, for example, nyc-vacation.m3u8. The name cannot include a /
     * character. If you create more than one master playlist (not
     * recommended), the values of all <code>Name</code> objects must be
     * unique. Elastic Transcoder automatically appends .m3u8 to the file
     * name. If you include .m3u8 in <code>Name</code>, it will appear twice
     * in the file name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String name;

    /**
     * This value must currently be HLSv3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)<br/>
     */
    private String format;

    /**
     * For each output in this job that you want to include in a master
     * playlist, the value of the <code>Outputs:Key</code> object. If you
     * include more than one output in a playlist, the value of
     * <code>SegmentDuration</code> for all of the outputs must be the same.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> outputKeys;

    /**
     * The name that you want Elastic Transcoder to assign to the master
     * playlist, for example, nyc-vacation.m3u8. The name cannot include a /
     * character. If you create more than one master playlist (not
     * recommended), the values of all <code>Name</code> objects must be
     * unique. Elastic Transcoder automatically appends .m3u8 to the file
     * name. If you include .m3u8 in <code>Name</code>, it will appear twice
     * in the file name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The name that you want Elastic Transcoder to assign to the master
     *         playlist, for example, nyc-vacation.m3u8. The name cannot include a /
     *         character. If you create more than one master playlist (not
     *         recommended), the values of all <code>Name</code> objects must be
     *         unique. Elastic Transcoder automatically appends .m3u8 to the file
     *         name. If you include .m3u8 in <code>Name</code>, it will appear twice
     *         in the file name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name that you want Elastic Transcoder to assign to the master
     * playlist, for example, nyc-vacation.m3u8. The name cannot include a /
     * character. If you create more than one master playlist (not
     * recommended), the values of all <code>Name</code> objects must be
     * unique. Elastic Transcoder automatically appends .m3u8 to the file
     * name. If you include .m3u8 in <code>Name</code>, it will appear twice
     * in the file name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param name The name that you want Elastic Transcoder to assign to the master
     *         playlist, for example, nyc-vacation.m3u8. The name cannot include a /
     *         character. If you create more than one master playlist (not
     *         recommended), the values of all <code>Name</code> objects must be
     *         unique. Elastic Transcoder automatically appends .m3u8 to the file
     *         name. If you include .m3u8 in <code>Name</code>, it will appear twice
     *         in the file name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name that you want Elastic Transcoder to assign to the master
     * playlist, for example, nyc-vacation.m3u8. The name cannot include a /
     * character. If you create more than one master playlist (not
     * recommended), the values of all <code>Name</code> objects must be
     * unique. Elastic Transcoder automatically appends .m3u8 to the file
     * name. If you include .m3u8 in <code>Name</code>, it will appear twice
     * in the file name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param name The name that you want Elastic Transcoder to assign to the master
     *         playlist, for example, nyc-vacation.m3u8. The name cannot include a /
     *         character. If you create more than one master playlist (not
     *         recommended), the values of all <code>Name</code> objects must be
     *         unique. Elastic Transcoder automatically appends .m3u8 to the file
     *         name. If you include .m3u8 in <code>Name</code>, it will appear twice
     *         in the file name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobPlaylist withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * This value must currently be HLSv3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)<br/>
     *
     * @return This value must currently be HLSv3.
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * This value must currently be HLSv3.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)<br/>
     *
     * @param format This value must currently be HLSv3.
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * This value must currently be HLSv3.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)<br/>
     *
     * @param format This value must currently be HLSv3.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobPlaylist withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * For each output in this job that you want to include in a master
     * playlist, the value of the <code>Outputs:Key</code> object. If you
     * include more than one output in a playlist, the value of
     * <code>SegmentDuration</code> for all of the outputs must be the same.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return For each output in this job that you want to include in a master
     *         playlist, the value of the <code>Outputs:Key</code> object. If you
     *         include more than one output in a playlist, the value of
     *         <code>SegmentDuration</code> for all of the outputs must be the same.
     */
    public java.util.List<String> getOutputKeys() {
        if (outputKeys == null) {
              outputKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              outputKeys.setAutoConstruct(true);
        }
        return outputKeys;
    }
    
    /**
     * For each output in this job that you want to include in a master
     * playlist, the value of the <code>Outputs:Key</code> object. If you
     * include more than one output in a playlist, the value of
     * <code>SegmentDuration</code> for all of the outputs must be the same.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputKeys For each output in this job that you want to include in a master
     *         playlist, the value of the <code>Outputs:Key</code> object. If you
     *         include more than one output in a playlist, the value of
     *         <code>SegmentDuration</code> for all of the outputs must be the same.
     */
    public void setOutputKeys(java.util.Collection<String> outputKeys) {
        if (outputKeys == null) {
            this.outputKeys = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> outputKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(outputKeys.size());
        outputKeysCopy.addAll(outputKeys);
        this.outputKeys = outputKeysCopy;
    }
    
    /**
     * For each output in this job that you want to include in a master
     * playlist, the value of the <code>Outputs:Key</code> object. If you
     * include more than one output in a playlist, the value of
     * <code>SegmentDuration</code> for all of the outputs must be the same.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputKeys For each output in this job that you want to include in a master
     *         playlist, the value of the <code>Outputs:Key</code> object. If you
     *         include more than one output in a playlist, the value of
     *         <code>SegmentDuration</code> for all of the outputs must be the same.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobPlaylist withOutputKeys(String... outputKeys) {
        if (getOutputKeys() == null) setOutputKeys(new java.util.ArrayList<String>(outputKeys.length));
        for (String value : outputKeys) {
            getOutputKeys().add(value);
        }
        return this;
    }
    
    /**
     * For each output in this job that you want to include in a master
     * playlist, the value of the <code>Outputs:Key</code> object. If you
     * include more than one output in a playlist, the value of
     * <code>SegmentDuration</code> for all of the outputs must be the same.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputKeys For each output in this job that you want to include in a master
     *         playlist, the value of the <code>Outputs:Key</code> object. If you
     *         include more than one output in a playlist, the value of
     *         <code>SegmentDuration</code> for all of the outputs must be the same.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobPlaylist withOutputKeys(java.util.Collection<String> outputKeys) {
        if (outputKeys == null) {
            this.outputKeys = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> outputKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(outputKeys.size());
            outputKeysCopy.addAll(outputKeys);
            this.outputKeys = outputKeysCopy;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getOutputKeys() != null) sb.append("OutputKeys: " + getOutputKeys() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode()); 
        hashCode = prime * hashCode + ((getOutputKeys() == null) ? 0 : getOutputKeys().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateJobPlaylist == false) return false;
        CreateJobPlaylist other = (CreateJobPlaylist)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getOutputKeys() == null ^ this.getOutputKeys() == null) return false;
        if (other.getOutputKeys() != null && other.getOutputKeys().equals(this.getOutputKeys()) == false) return false; 
        return true;
    }
    
}
    