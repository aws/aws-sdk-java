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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartSourceNetworkRecovery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSourceNetworkRecoveryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Don't update existing CloudFormation Stack, recover the network using a new stack.
     * </p>
     */
    private Boolean deployAsNew;
    /**
     * <p>
     * The Source Networks that we want to start a Recovery Job for.
     * </p>
     */
    private java.util.List<StartSourceNetworkRecoveryRequestNetworkEntry> sourceNetworks;
    /**
     * <p>
     * The tags to be associated with the Source Network recovery Job.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Don't update existing CloudFormation Stack, recover the network using a new stack.
     * </p>
     * 
     * @param deployAsNew
     *        Don't update existing CloudFormation Stack, recover the network using a new stack.
     */

    public void setDeployAsNew(Boolean deployAsNew) {
        this.deployAsNew = deployAsNew;
    }

    /**
     * <p>
     * Don't update existing CloudFormation Stack, recover the network using a new stack.
     * </p>
     * 
     * @return Don't update existing CloudFormation Stack, recover the network using a new stack.
     */

    public Boolean getDeployAsNew() {
        return this.deployAsNew;
    }

    /**
     * <p>
     * Don't update existing CloudFormation Stack, recover the network using a new stack.
     * </p>
     * 
     * @param deployAsNew
     *        Don't update existing CloudFormation Stack, recover the network using a new stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSourceNetworkRecoveryRequest withDeployAsNew(Boolean deployAsNew) {
        setDeployAsNew(deployAsNew);
        return this;
    }

    /**
     * <p>
     * Don't update existing CloudFormation Stack, recover the network using a new stack.
     * </p>
     * 
     * @return Don't update existing CloudFormation Stack, recover the network using a new stack.
     */

    public Boolean isDeployAsNew() {
        return this.deployAsNew;
    }

    /**
     * <p>
     * The Source Networks that we want to start a Recovery Job for.
     * </p>
     * 
     * @return The Source Networks that we want to start a Recovery Job for.
     */

    public java.util.List<StartSourceNetworkRecoveryRequestNetworkEntry> getSourceNetworks() {
        return sourceNetworks;
    }

    /**
     * <p>
     * The Source Networks that we want to start a Recovery Job for.
     * </p>
     * 
     * @param sourceNetworks
     *        The Source Networks that we want to start a Recovery Job for.
     */

    public void setSourceNetworks(java.util.Collection<StartSourceNetworkRecoveryRequestNetworkEntry> sourceNetworks) {
        if (sourceNetworks == null) {
            this.sourceNetworks = null;
            return;
        }

        this.sourceNetworks = new java.util.ArrayList<StartSourceNetworkRecoveryRequestNetworkEntry>(sourceNetworks);
    }

    /**
     * <p>
     * The Source Networks that we want to start a Recovery Job for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceNetworks(java.util.Collection)} or {@link #withSourceNetworks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceNetworks
     *        The Source Networks that we want to start a Recovery Job for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSourceNetworkRecoveryRequest withSourceNetworks(StartSourceNetworkRecoveryRequestNetworkEntry... sourceNetworks) {
        if (this.sourceNetworks == null) {
            setSourceNetworks(new java.util.ArrayList<StartSourceNetworkRecoveryRequestNetworkEntry>(sourceNetworks.length));
        }
        for (StartSourceNetworkRecoveryRequestNetworkEntry ele : sourceNetworks) {
            this.sourceNetworks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Source Networks that we want to start a Recovery Job for.
     * </p>
     * 
     * @param sourceNetworks
     *        The Source Networks that we want to start a Recovery Job for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSourceNetworkRecoveryRequest withSourceNetworks(java.util.Collection<StartSourceNetworkRecoveryRequestNetworkEntry> sourceNetworks) {
        setSourceNetworks(sourceNetworks);
        return this;
    }

    /**
     * <p>
     * The tags to be associated with the Source Network recovery Job.
     * </p>
     * 
     * @return The tags to be associated with the Source Network recovery Job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be associated with the Source Network recovery Job.
     * </p>
     * 
     * @param tags
     *        The tags to be associated with the Source Network recovery Job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be associated with the Source Network recovery Job.
     * </p>
     * 
     * @param tags
     *        The tags to be associated with the Source Network recovery Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSourceNetworkRecoveryRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartSourceNetworkRecoveryRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartSourceNetworkRecoveryRequest addTagsEntry(String key, String value) {
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

    public StartSourceNetworkRecoveryRequest clearTagsEntries() {
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
        if (getDeployAsNew() != null)
            sb.append("DeployAsNew: ").append(getDeployAsNew()).append(",");
        if (getSourceNetworks() != null)
            sb.append("SourceNetworks: ").append(getSourceNetworks()).append(",");
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

        if (obj instanceof StartSourceNetworkRecoveryRequest == false)
            return false;
        StartSourceNetworkRecoveryRequest other = (StartSourceNetworkRecoveryRequest) obj;
        if (other.getDeployAsNew() == null ^ this.getDeployAsNew() == null)
            return false;
        if (other.getDeployAsNew() != null && other.getDeployAsNew().equals(this.getDeployAsNew()) == false)
            return false;
        if (other.getSourceNetworks() == null ^ this.getSourceNetworks() == null)
            return false;
        if (other.getSourceNetworks() != null && other.getSourceNetworks().equals(this.getSourceNetworks()) == false)
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

        hashCode = prime * hashCode + ((getDeployAsNew() == null) ? 0 : getDeployAsNew().hashCode());
        hashCode = prime * hashCode + ((getSourceNetworks() == null) ? 0 : getSourceNetworks().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartSourceNetworkRecoveryRequest clone() {
        return (StartSourceNetworkRecoveryRequest) super.clone();
    }

}
