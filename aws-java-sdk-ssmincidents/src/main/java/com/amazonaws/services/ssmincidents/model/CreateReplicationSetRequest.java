/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CreateReplicationSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicationSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Regions that Incident Manager replicates your data to. You can have up to three Regions in your replication
     * set.
     * </p>
     */
    private java.util.Map<String, RegionMapInputValue> regions;

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @return A token ensuring that the action is called only once with the specified details.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token ensuring that the action is called only once with the specified details.
     * </p>
     * 
     * @param clientToken
     *        A token ensuring that the action is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationSetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Regions that Incident Manager replicates your data to. You can have up to three Regions in your replication
     * set.
     * </p>
     * 
     * @return The Regions that Incident Manager replicates your data to. You can have up to three Regions in your
     *         replication set.
     */

    public java.util.Map<String, RegionMapInputValue> getRegions() {
        return regions;
    }

    /**
     * <p>
     * The Regions that Incident Manager replicates your data to. You can have up to three Regions in your replication
     * set.
     * </p>
     * 
     * @param regions
     *        The Regions that Incident Manager replicates your data to. You can have up to three Regions in your
     *        replication set.
     */

    public void setRegions(java.util.Map<String, RegionMapInputValue> regions) {
        this.regions = regions;
    }

    /**
     * <p>
     * The Regions that Incident Manager replicates your data to. You can have up to three Regions in your replication
     * set.
     * </p>
     * 
     * @param regions
     *        The Regions that Incident Manager replicates your data to. You can have up to three Regions in your
     *        replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationSetRequest withRegions(java.util.Map<String, RegionMapInputValue> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * Add a single Regions entry
     *
     * @see CreateReplicationSetRequest#withRegions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationSetRequest addRegionsEntry(String key, RegionMapInputValue value) {
        if (null == this.regions) {
            this.regions = new java.util.HashMap<String, RegionMapInputValue>();
        }
        if (this.regions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.regions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Regions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationSetRequest clearRegionsEntries() {
        this.regions = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicationSetRequest == false)
            return false;
        CreateReplicationSetRequest other = (CreateReplicationSetRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationSetRequest clone() {
        return (CreateReplicationSetRequest) super.clone();
    }

}
