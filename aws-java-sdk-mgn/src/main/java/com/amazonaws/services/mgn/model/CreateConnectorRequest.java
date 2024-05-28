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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Create Connector request name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Create Connector request SSM command config.
     * </p>
     */
    private ConnectorSsmCommandConfig ssmCommandConfig;
    /**
     * <p>
     * Create Connector request SSM instance ID.
     * </p>
     */
    private String ssmInstanceID;
    /**
     * <p>
     * Create Connector request tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Create Connector request name.
     * </p>
     * 
     * @param name
     *        Create Connector request name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Create Connector request name.
     * </p>
     * 
     * @return Create Connector request name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Create Connector request name.
     * </p>
     * 
     * @param name
     *        Create Connector request name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Create Connector request SSM command config.
     * </p>
     * 
     * @param ssmCommandConfig
     *        Create Connector request SSM command config.
     */

    public void setSsmCommandConfig(ConnectorSsmCommandConfig ssmCommandConfig) {
        this.ssmCommandConfig = ssmCommandConfig;
    }

    /**
     * <p>
     * Create Connector request SSM command config.
     * </p>
     * 
     * @return Create Connector request SSM command config.
     */

    public ConnectorSsmCommandConfig getSsmCommandConfig() {
        return this.ssmCommandConfig;
    }

    /**
     * <p>
     * Create Connector request SSM command config.
     * </p>
     * 
     * @param ssmCommandConfig
     *        Create Connector request SSM command config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withSsmCommandConfig(ConnectorSsmCommandConfig ssmCommandConfig) {
        setSsmCommandConfig(ssmCommandConfig);
        return this;
    }

    /**
     * <p>
     * Create Connector request SSM instance ID.
     * </p>
     * 
     * @param ssmInstanceID
     *        Create Connector request SSM instance ID.
     */

    public void setSsmInstanceID(String ssmInstanceID) {
        this.ssmInstanceID = ssmInstanceID;
    }

    /**
     * <p>
     * Create Connector request SSM instance ID.
     * </p>
     * 
     * @return Create Connector request SSM instance ID.
     */

    public String getSsmInstanceID() {
        return this.ssmInstanceID;
    }

    /**
     * <p>
     * Create Connector request SSM instance ID.
     * </p>
     * 
     * @param ssmInstanceID
     *        Create Connector request SSM instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withSsmInstanceID(String ssmInstanceID) {
        setSsmInstanceID(ssmInstanceID);
        return this;
    }

    /**
     * <p>
     * Create Connector request tags.
     * </p>
     * 
     * @return Create Connector request tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Create Connector request tags.
     * </p>
     * 
     * @param tags
     *        Create Connector request tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Create Connector request tags.
     * </p>
     * 
     * @param tags
     *        Create Connector request tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateConnectorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorRequest addTagsEntry(String key, String value) {
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

    public CreateConnectorRequest clearTagsEntries() {
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

        if (obj instanceof CreateConnectorRequest == false)
            return false;
        CreateConnectorRequest other = (CreateConnectorRequest) obj;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSsmCommandConfig() == null) ? 0 : getSsmCommandConfig().hashCode());
        hashCode = prime * hashCode + ((getSsmInstanceID() == null) ? 0 : getSsmInstanceID().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectorRequest clone() {
        return (CreateConnectorRequest) super.clone();
    }

}
