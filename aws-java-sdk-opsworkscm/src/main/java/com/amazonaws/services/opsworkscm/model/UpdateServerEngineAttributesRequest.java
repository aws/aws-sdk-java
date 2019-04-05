/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/UpdateServerEngineAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServerEngineAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the server to update.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The name of the engine attribute to update.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The value to set for the attribute.
     * </p>
     */
    private String attributeValue;

    /**
     * <p>
     * The name of the server to update.
     * </p>
     * 
     * @param serverName
     *        The name of the server to update.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server to update.
     * </p>
     * 
     * @return The name of the server to update.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server to update.
     * </p>
     * 
     * @param serverName
     *        The name of the server to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerEngineAttributesRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The name of the engine attribute to update.
     * </p>
     * 
     * @param attributeName
     *        The name of the engine attribute to update.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the engine attribute to update.
     * </p>
     * 
     * @return The name of the engine attribute to update.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the engine attribute to update.
     * </p>
     * 
     * @param attributeName
     *        The name of the engine attribute to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerEngineAttributesRequest withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The value to set for the attribute.
     * </p>
     * 
     * @param attributeValue
     *        The value to set for the attribute.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value to set for the attribute.
     * </p>
     * 
     * @return The value to set for the attribute.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The value to set for the attribute.
     * </p>
     * 
     * @param attributeValue
     *        The value to set for the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServerEngineAttributesRequest withAttributeValue(String attributeValue) {
        setAttributeValue(attributeValue);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: ").append(getAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServerEngineAttributesRequest == false)
            return false;
        UpdateServerEngineAttributesRequest other = (UpdateServerEngineAttributesRequest) obj;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServerEngineAttributesRequest clone() {
        return (UpdateServerEngineAttributesRequest) super.clone();
    }

}
