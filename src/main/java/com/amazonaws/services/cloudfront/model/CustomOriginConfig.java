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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;


/**
 * <p>
 * A customer origin.
 * </p>
 */
public class CustomOriginConfig implements Serializable {

    /**
     * The HTTP port the custom origin listens on.
     */
    private Integer hTTPPort;

    /**
     * The HTTPS port the custom origin listens on.
     */
    private Integer hTTPSPort;

    /**
     * The origin protocol policy to apply to your origin.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer
     */
    private String originProtocolPolicy;

    /**
     * The HTTP port the custom origin listens on.
     *
     * @return The HTTP port the custom origin listens on.
     */
    public Integer getHTTPPort() {
        return hTTPPort;
    }
    
    /**
     * The HTTP port the custom origin listens on.
     *
     * @param hTTPPort The HTTP port the custom origin listens on.
     */
    public void setHTTPPort(Integer hTTPPort) {
        this.hTTPPort = hTTPPort;
    }
    
    /**
     * The HTTP port the custom origin listens on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hTTPPort The HTTP port the custom origin listens on.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CustomOriginConfig withHTTPPort(Integer hTTPPort) {
        this.hTTPPort = hTTPPort;
        return this;
    }

    /**
     * The HTTPS port the custom origin listens on.
     *
     * @return The HTTPS port the custom origin listens on.
     */
    public Integer getHTTPSPort() {
        return hTTPSPort;
    }
    
    /**
     * The HTTPS port the custom origin listens on.
     *
     * @param hTTPSPort The HTTPS port the custom origin listens on.
     */
    public void setHTTPSPort(Integer hTTPSPort) {
        this.hTTPSPort = hTTPSPort;
    }
    
    /**
     * The HTTPS port the custom origin listens on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hTTPSPort The HTTPS port the custom origin listens on.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CustomOriginConfig withHTTPSPort(Integer hTTPSPort) {
        this.hTTPSPort = hTTPSPort;
        return this;
    }

    /**
     * The origin protocol policy to apply to your origin.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer
     *
     * @return The origin protocol policy to apply to your origin.
     *
     * @see OriginProtocolPolicy
     */
    public String getOriginProtocolPolicy() {
        return originProtocolPolicy;
    }
    
    /**
     * The origin protocol policy to apply to your origin.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer
     *
     * @param originProtocolPolicy The origin protocol policy to apply to your origin.
     *
     * @see OriginProtocolPolicy
     */
    public void setOriginProtocolPolicy(String originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy;
    }
    
    /**
     * The origin protocol policy to apply to your origin.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer
     *
     * @param originProtocolPolicy The origin protocol policy to apply to your origin.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OriginProtocolPolicy
     */
    public CustomOriginConfig withOriginProtocolPolicy(String originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy;
        return this;
    }

    /**
     * The origin protocol policy to apply to your origin.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer
     *
     * @param originProtocolPolicy The origin protocol policy to apply to your origin.
     *
     * @see OriginProtocolPolicy
     */
    public void setOriginProtocolPolicy(OriginProtocolPolicy originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy.toString();
    }
    
    /**
     * The origin protocol policy to apply to your origin.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http-only, match-viewer
     *
     * @param originProtocolPolicy The origin protocol policy to apply to your origin.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OriginProtocolPolicy
     */
    public CustomOriginConfig withOriginProtocolPolicy(OriginProtocolPolicy originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy.toString();
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
        if (getHTTPPort() != null) sb.append("HTTPPort: " + getHTTPPort() + ",");
        if (getHTTPSPort() != null) sb.append("HTTPSPort: " + getHTTPSPort() + ",");
        if (getOriginProtocolPolicy() != null) sb.append("OriginProtocolPolicy: " + getOriginProtocolPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHTTPPort() == null) ? 0 : getHTTPPort().hashCode()); 
        hashCode = prime * hashCode + ((getHTTPSPort() == null) ? 0 : getHTTPSPort().hashCode()); 
        hashCode = prime * hashCode + ((getOriginProtocolPolicy() == null) ? 0 : getOriginProtocolPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CustomOriginConfig == false) return false;
        CustomOriginConfig other = (CustomOriginConfig)obj;
        
        if (other.getHTTPPort() == null ^ this.getHTTPPort() == null) return false;
        if (other.getHTTPPort() != null && other.getHTTPPort().equals(this.getHTTPPort()) == false) return false; 
        if (other.getHTTPSPort() == null ^ this.getHTTPSPort() == null) return false;
        if (other.getHTTPSPort() != null && other.getHTTPSPort().equals(this.getHTTPSPort()) == false) return false; 
        if (other.getOriginProtocolPolicy() == null ^ this.getOriginProtocolPolicy() == null) return false;
        if (other.getOriginProtocolPolicy() != null && other.getOriginProtocolPolicy().equals(this.getOriginProtocolPolicy()) == false) return false; 
        return true;
    }
    
}
    