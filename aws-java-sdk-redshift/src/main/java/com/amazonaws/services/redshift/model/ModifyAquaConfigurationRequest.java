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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyAquaConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyAquaConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cluster to be modified.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The new value of AQUA configuration status. Possible values include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * enabled - Use AQUA if it is available for the current AWS Region and Amazon Redshift node type.
     * </p>
     * </li>
     * <li>
     * <p>
     * disabled - Don't use AQUA.
     * </p>
     * </li>
     * <li>
     * <p>
     * auto - Amazon Redshift determines whether to use AQUA.
     * </p>
     * </li>
     * </ul>
     */
    private String aquaConfigurationStatus;

    /**
     * <p>
     * The identifier of the cluster to be modified.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster to be modified.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to be modified.
     * </p>
     * 
     * @return The identifier of the cluster to be modified.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to be modified.
     * </p>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyAquaConfigurationRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The new value of AQUA configuration status. Possible values include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * enabled - Use AQUA if it is available for the current AWS Region and Amazon Redshift node type.
     * </p>
     * </li>
     * <li>
     * <p>
     * disabled - Don't use AQUA.
     * </p>
     * </li>
     * <li>
     * <p>
     * auto - Amazon Redshift determines whether to use AQUA.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aquaConfigurationStatus
     *        The new value of AQUA configuration status. Possible values include the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        enabled - Use AQUA if it is available for the current AWS Region and Amazon Redshift node type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        disabled - Don't use AQUA.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        auto - Amazon Redshift determines whether to use AQUA.
     *        </p>
     *        </li>
     * @see AquaConfigurationStatus
     */

    public void setAquaConfigurationStatus(String aquaConfigurationStatus) {
        this.aquaConfigurationStatus = aquaConfigurationStatus;
    }

    /**
     * <p>
     * The new value of AQUA configuration status. Possible values include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * enabled - Use AQUA if it is available for the current AWS Region and Amazon Redshift node type.
     * </p>
     * </li>
     * <li>
     * <p>
     * disabled - Don't use AQUA.
     * </p>
     * </li>
     * <li>
     * <p>
     * auto - Amazon Redshift determines whether to use AQUA.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The new value of AQUA configuration status. Possible values include the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         enabled - Use AQUA if it is available for the current AWS Region and Amazon Redshift node type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         disabled - Don't use AQUA.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         auto - Amazon Redshift determines whether to use AQUA.
     *         </p>
     *         </li>
     * @see AquaConfigurationStatus
     */

    public String getAquaConfigurationStatus() {
        return this.aquaConfigurationStatus;
    }

    /**
     * <p>
     * The new value of AQUA configuration status. Possible values include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * enabled - Use AQUA if it is available for the current AWS Region and Amazon Redshift node type.
     * </p>
     * </li>
     * <li>
     * <p>
     * disabled - Don't use AQUA.
     * </p>
     * </li>
     * <li>
     * <p>
     * auto - Amazon Redshift determines whether to use AQUA.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aquaConfigurationStatus
     *        The new value of AQUA configuration status. Possible values include the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        enabled - Use AQUA if it is available for the current AWS Region and Amazon Redshift node type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        disabled - Don't use AQUA.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        auto - Amazon Redshift determines whether to use AQUA.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AquaConfigurationStatus
     */

    public ModifyAquaConfigurationRequest withAquaConfigurationStatus(String aquaConfigurationStatus) {
        setAquaConfigurationStatus(aquaConfigurationStatus);
        return this;
    }

    /**
     * <p>
     * The new value of AQUA configuration status. Possible values include the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * enabled - Use AQUA if it is available for the current AWS Region and Amazon Redshift node type.
     * </p>
     * </li>
     * <li>
     * <p>
     * disabled - Don't use AQUA.
     * </p>
     * </li>
     * <li>
     * <p>
     * auto - Amazon Redshift determines whether to use AQUA.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aquaConfigurationStatus
     *        The new value of AQUA configuration status. Possible values include the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        enabled - Use AQUA if it is available for the current AWS Region and Amazon Redshift node type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        disabled - Don't use AQUA.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        auto - Amazon Redshift determines whether to use AQUA.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AquaConfigurationStatus
     */

    public ModifyAquaConfigurationRequest withAquaConfigurationStatus(AquaConfigurationStatus aquaConfigurationStatus) {
        this.aquaConfigurationStatus = aquaConfigurationStatus.toString();
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getAquaConfigurationStatus() != null)
            sb.append("AquaConfigurationStatus: ").append(getAquaConfigurationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyAquaConfigurationRequest == false)
            return false;
        ModifyAquaConfigurationRequest other = (ModifyAquaConfigurationRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getAquaConfigurationStatus() == null ^ this.getAquaConfigurationStatus() == null)
            return false;
        if (other.getAquaConfigurationStatus() != null && other.getAquaConfigurationStatus().equals(this.getAquaConfigurationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAquaConfigurationStatus() == null) ? 0 : getAquaConfigurationStatus().hashCode());
        return hashCode;
    }

    @Override
    public ModifyAquaConfigurationRequest clone() {
        return (ModifyAquaConfigurationRequest) super.clone();
    }

}
