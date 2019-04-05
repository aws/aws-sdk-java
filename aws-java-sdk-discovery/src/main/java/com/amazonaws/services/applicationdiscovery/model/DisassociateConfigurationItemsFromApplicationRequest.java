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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateConfigurationItemsFromApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Configuration ID of an application from which each item is disassociated.
     * </p>
     */
    private String applicationConfigurationId;
    /**
     * <p>
     * Configuration ID of each item to be disassociated from an application.
     * </p>
     */
    private java.util.List<String> configurationIds;

    /**
     * <p>
     * Configuration ID of an application from which each item is disassociated.
     * </p>
     * 
     * @param applicationConfigurationId
     *        Configuration ID of an application from which each item is disassociated.
     */

    public void setApplicationConfigurationId(String applicationConfigurationId) {
        this.applicationConfigurationId = applicationConfigurationId;
    }

    /**
     * <p>
     * Configuration ID of an application from which each item is disassociated.
     * </p>
     * 
     * @return Configuration ID of an application from which each item is disassociated.
     */

    public String getApplicationConfigurationId() {
        return this.applicationConfigurationId;
    }

    /**
     * <p>
     * Configuration ID of an application from which each item is disassociated.
     * </p>
     * 
     * @param applicationConfigurationId
     *        Configuration ID of an application from which each item is disassociated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateConfigurationItemsFromApplicationRequest withApplicationConfigurationId(String applicationConfigurationId) {
        setApplicationConfigurationId(applicationConfigurationId);
        return this;
    }

    /**
     * <p>
     * Configuration ID of each item to be disassociated from an application.
     * </p>
     * 
     * @return Configuration ID of each item to be disassociated from an application.
     */

    public java.util.List<String> getConfigurationIds() {
        return configurationIds;
    }

    /**
     * <p>
     * Configuration ID of each item to be disassociated from an application.
     * </p>
     * 
     * @param configurationIds
     *        Configuration ID of each item to be disassociated from an application.
     */

    public void setConfigurationIds(java.util.Collection<String> configurationIds) {
        if (configurationIds == null) {
            this.configurationIds = null;
            return;
        }

        this.configurationIds = new java.util.ArrayList<String>(configurationIds);
    }

    /**
     * <p>
     * Configuration ID of each item to be disassociated from an application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationIds(java.util.Collection)} or {@link #withConfigurationIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configurationIds
     *        Configuration ID of each item to be disassociated from an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateConfigurationItemsFromApplicationRequest withConfigurationIds(String... configurationIds) {
        if (this.configurationIds == null) {
            setConfigurationIds(new java.util.ArrayList<String>(configurationIds.length));
        }
        for (String ele : configurationIds) {
            this.configurationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration ID of each item to be disassociated from an application.
     * </p>
     * 
     * @param configurationIds
     *        Configuration ID of each item to be disassociated from an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateConfigurationItemsFromApplicationRequest withConfigurationIds(java.util.Collection<String> configurationIds) {
        setConfigurationIds(configurationIds);
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
        if (getApplicationConfigurationId() != null)
            sb.append("ApplicationConfigurationId: ").append(getApplicationConfigurationId()).append(",");
        if (getConfigurationIds() != null)
            sb.append("ConfigurationIds: ").append(getConfigurationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateConfigurationItemsFromApplicationRequest == false)
            return false;
        DisassociateConfigurationItemsFromApplicationRequest other = (DisassociateConfigurationItemsFromApplicationRequest) obj;
        if (other.getApplicationConfigurationId() == null ^ this.getApplicationConfigurationId() == null)
            return false;
        if (other.getApplicationConfigurationId() != null && other.getApplicationConfigurationId().equals(this.getApplicationConfigurationId()) == false)
            return false;
        if (other.getConfigurationIds() == null ^ this.getConfigurationIds() == null)
            return false;
        if (other.getConfigurationIds() != null && other.getConfigurationIds().equals(this.getConfigurationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationConfigurationId() == null) ? 0 : getApplicationConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationIds() == null) ? 0 : getConfigurationIds().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateConfigurationItemsFromApplicationRequest clone() {
        return (DisassociateConfigurationItemsFromApplicationRequest) super.clone();
    }

}
