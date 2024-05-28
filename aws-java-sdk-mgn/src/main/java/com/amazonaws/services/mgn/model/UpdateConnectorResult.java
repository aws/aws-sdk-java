/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Connector arn.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Connector ID.
     * </p>
     */
    private String connectorID;
    /**
     * <p>
     * Connector name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Connector SSM command config.
     * </p>
     */
    private ConnectorSsmCommandConfig ssmCommandConfig;
    /**
     * <p>
     * Connector SSM instance ID.
     * </p>
     */
    private String ssmInstanceID;
    /**
     * <p>
     * Connector tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Connector arn.
     * </p>
     * 
     * @param arn
     *        Connector arn.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Connector arn.
     * </p>
     * 
     * @return Connector arn.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Connector arn.
     * </p>
     * 
     * @param arn
     *        Connector arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Connector ID.
     * </p>
     * 
     * @param connectorID
     *        Connector ID.
     */

    public void setConnectorID(String connectorID) {
        this.connectorID = connectorID;
    }

    /**
     * <p>
     * Connector ID.
     * </p>
     * 
     * @return Connector ID.
     */

    public String getConnectorID() {
        return this.connectorID;
    }

    /**
     * <p>
     * Connector ID.
     * </p>
     * 
     * @param connectorID
     *        Connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorResult withConnectorID(String connectorID) {
        setConnectorID(connectorID);
        return this;
    }

    /**
     * <p>
     * Connector name.
     * </p>
     * 
     * @param name
     *        Connector name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Connector name.
     * </p>
     * 
     * @return Connector name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Connector name.
     * </p>
     * 
     * @param name
     *        Connector name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Connector SSM command config.
     * </p>
     * 
     * @param ssmCommandConfig
     *        Connector SSM command config.
     */

    public void setSsmCommandConfig(ConnectorSsmCommandConfig ssmCommandConfig) {
        this.ssmCommandConfig = ssmCommandConfig;
    }

    /**
     * <p>
     * Connector SSM command config.
     * </p>
     * 
     * @return Connector SSM command config.
     */

    public ConnectorSsmCommandConfig getSsmCommandConfig() {
        return this.ssmCommandConfig;
    }

    /**
     * <p>
     * Connector SSM command config.
     * </p>
     * 
     * @param ssmCommandConfig
     *        Connector SSM command config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorResult withSsmCommandConfig(ConnectorSsmCommandConfig ssmCommandConfig) {
        setSsmCommandConfig(ssmCommandConfig);
        return this;
    }

    /**
     * <p>
     * Connector SSM instance ID.
     * </p>
     * 
     * @param ssmInstanceID
     *        Connector SSM instance ID.
     */

    public void setSsmInstanceID(String ssmInstanceID) {
        this.ssmInstanceID = ssmInstanceID;
    }

    /**
     * <p>
     * Connector SSM instance ID.
     * </p>
     * 
     * @return Connector SSM instance ID.
     */

    public String getSsmInstanceID() {
        return this.ssmInstanceID;
    }

    /**
     * <p>
     * Connector SSM instance ID.
     * </p>
     * 
     * @param ssmInstanceID
     *        Connector SSM instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorResult withSsmInstanceID(String ssmInstanceID) {
        setSsmInstanceID(ssmInstanceID);
        return this;
    }

    /**
     * <p>
     * Connector tags.
     * </p>
     * 
     * @return Connector tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Connector tags.
     * </p>
     * 
     * @param tags
     *        Connector tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Connector tags.
     * </p>
     * 
     * @param tags
     *        Connector tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateConnectorResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorResult clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getConnectorID() != null)
            sb.append("ConnectorID: ").append(getConnectorID()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSsmCommandConfig() != null)
            sb.append("SsmCommandConfig: ").append(getSsmCommandConfig()).append(",");
        if (getSsmInstanceID() != null)
            sb.append("SsmInstanceID: ").append(getSsmInstanceID()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectorResult == false)
            return false;
        UpdateConnectorResult other = (UpdateConnectorResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConnectorID() == null ^ this.getConnectorID() == null)
            return false;
        if (other.getConnectorID() != null && other.getConnectorID().equals(this.getConnectorID()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSsmCommandConfig() == null ^ this.getSsmCommandConfig() == null)
            return false;
        if (other.getSsmCommandConfig() != null && other.getSsmCommandConfig().equals(this.getSsmCommandConfig()) == false)
            return false;
        if (other.getSsmInstanceID() == null ^ this.getSsmInstanceID() == null)
            return false;
        if (other.getSsmInstanceID() != null && other.getSsmInstanceID().equals(this.getSsmInstanceID()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConnectorID() == null) ? 0 : getConnectorID().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSsmCommandConfig() == null) ? 0 : getSsmCommandConfig().hashCode());
        hashCode = prime * hashCode + ((getSsmInstanceID() == null) ? 0 : getSsmInstanceID().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectorResult clone() {
        try {
            return (UpdateConnectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
