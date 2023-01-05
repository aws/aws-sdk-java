/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/CreateClusterV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterV2Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * A map of tags that you want the cluster to have.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Information about the provisioned cluster.
     * </p>
     */
    private ProvisionedRequest provisioned;
    /**
     * <p>
     * Information about the serverless cluster.
     * </p>
     */
    private ServerlessRequest serverless;

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        <p>
     *        The name of the cluster.
     *        </p>
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return <p>
     *         The name of the cluster.
     *         </p>
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        <p>
     *        The name of the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterV2Request withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * A map of tags that you want the cluster to have.
     * </p>
     * 
     * @return <p>
     *         A map of tags that you want the cluster to have.
     *         </p>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of tags that you want the cluster to have.
     * </p>
     * 
     * @param tags
     *        <p>
     *        A map of tags that you want the cluster to have.
     *        </p>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of tags that you want the cluster to have.
     * </p>
     * 
     * @param tags
     *        <p>
     *        A map of tags that you want the cluster to have.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterV2Request withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateClusterV2Request#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterV2Request addTagsEntry(String key, String value) {
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

    public CreateClusterV2Request clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Information about the provisioned cluster.
     * </p>
     * 
     * @param provisioned
     *        <p>
     *        Information about the provisioned cluster.
     *        </p>
     */

    public void setProvisioned(ProvisionedRequest provisioned) {
        this.provisioned = provisioned;
    }

    /**
     * <p>
     * Information about the provisioned cluster.
     * </p>
     * 
     * @return <p>
     *         Information about the provisioned cluster.
     *         </p>
     */

    public ProvisionedRequest getProvisioned() {
        return this.provisioned;
    }

    /**
     * <p>
     * Information about the provisioned cluster.
     * </p>
     * 
     * @param provisioned
     *        <p>
     *        Information about the provisioned cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterV2Request withProvisioned(ProvisionedRequest provisioned) {
        setProvisioned(provisioned);
        return this;
    }

    /**
     * <p>
     * Information about the serverless cluster.
     * </p>
     * 
     * @param serverless
     *        <p>
     *        Information about the serverless cluster.
     *        </p>
     */

    public void setServerless(ServerlessRequest serverless) {
        this.serverless = serverless;
    }

    /**
     * <p>
     * Information about the serverless cluster.
     * </p>
     * 
     * @return <p>
     *         Information about the serverless cluster.
     *         </p>
     */

    public ServerlessRequest getServerless() {
        return this.serverless;
    }

    /**
     * <p>
     * Information about the serverless cluster.
     * </p>
     * 
     * @param serverless
     *        <p>
     *        Information about the serverless cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterV2Request withServerless(ServerlessRequest serverless) {
        setServerless(serverless);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProvisioned() != null)
            sb.append("Provisioned: ").append(getProvisioned()).append(",");
        if (getServerless() != null)
            sb.append("Serverless: ").append(getServerless());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterV2Request == false)
            return false;
        CreateClusterV2Request other = (CreateClusterV2Request) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProvisioned() == null ^ this.getProvisioned() == null)
            return false;
        if (other.getProvisioned() != null && other.getProvisioned().equals(this.getProvisioned()) == false)
            return false;
        if (other.getServerless() == null ^ this.getServerless() == null)
            return false;
        if (other.getServerless() != null && other.getServerless().equals(this.getServerless()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getProvisioned() == null) ? 0 : getProvisioned().hashCode());
        hashCode = prime * hashCode + ((getServerless() == null) ? 0 : getServerless().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterV2Request clone() {
        return (CreateClusterV2Request) super.clone();
    }

}
