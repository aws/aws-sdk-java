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
 * 
 */
public class Playlist  implements Serializable  {

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String name;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)<br/>
     */
    private String format;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> outputKeys;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     */
    private String status;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     */
    private String statusDetail;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param name 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Playlist withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)<br/>
     *
     * @return 
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)<br/>
     *
     * @param format 
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^HLSv3$)<br/>
     *
     * @param format 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Playlist withFormat(String format) {
        this.format = format;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return 
     */
    public java.util.List<String> getOutputKeys() {
        
        if (outputKeys == null) {
              outputKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              outputKeys.setAutoConstruct(true);
        }
        return outputKeys;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputKeys 
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
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputKeys 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Playlist withOutputKeys(String... outputKeys) {
        if (getOutputKeys() == null) setOutputKeys(new java.util.ArrayList<String>(outputKeys.length));
        for (String value : outputKeys) {
            getOutputKeys().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param outputKeys 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Playlist withOutputKeys(java.util.Collection<String> outputKeys) {
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
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @return 
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Submitted$)|(^Progressing$)|(^Complete$)|(^Canceled$)|(^Error$)<br/>
     *
     * @param status 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Playlist withStatus(String status) {
        this.status = status;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @return 
     */
    public String getStatusDetail() {
        return statusDetail;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param statusDetail 
     */
    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     *
     * @param statusDetail 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Playlist withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
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
        if (getOutputKeys() != null) sb.append("OutputKeys: " + getOutputKeys() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusDetail() != null) sb.append("StatusDetail: " + getStatusDetail() );
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Playlist == false) return false;
        Playlist other = (Playlist)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getOutputKeys() == null ^ this.getOutputKeys() == null) return false;
        if (other.getOutputKeys() != null && other.getOutputKeys().equals(this.getOutputKeys()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null) return false;
        if (other.getStatusDetail() != null && other.getStatusDetail().equals(this.getStatusDetail()) == false) return false; 
        return true;
    }
    
}
    