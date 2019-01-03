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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListVPCEConfigurations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVPCEConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>VPCEConfiguration</code> objects containing information about your VPC endpoint configuration.
     * </p>
     */
    private java.util.List<VPCEConfiguration> vpceConfigurations;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>VPCEConfiguration</code> objects containing information about your VPC endpoint configuration.
     * </p>
     * 
     * @return An array of <code>VPCEConfiguration</code> objects containing information about your VPC endpoint
     *         configuration.
     */

    public java.util.List<VPCEConfiguration> getVpceConfigurations() {
        return vpceConfigurations;
    }

    /**
     * <p>
     * An array of <code>VPCEConfiguration</code> objects containing information about your VPC endpoint configuration.
     * </p>
     * 
     * @param vpceConfigurations
     *        An array of <code>VPCEConfiguration</code> objects containing information about your VPC endpoint
     *        configuration.
     */

    public void setVpceConfigurations(java.util.Collection<VPCEConfiguration> vpceConfigurations) {
        if (vpceConfigurations == null) {
            this.vpceConfigurations = null;
            return;
        }

        this.vpceConfigurations = new java.util.ArrayList<VPCEConfiguration>(vpceConfigurations);
    }

    /**
     * <p>
     * An array of <code>VPCEConfiguration</code> objects containing information about your VPC endpoint configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpceConfigurations(java.util.Collection)} or {@link #withVpceConfigurations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpceConfigurations
     *        An array of <code>VPCEConfiguration</code> objects containing information about your VPC endpoint
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVPCEConfigurationsResult withVpceConfigurations(VPCEConfiguration... vpceConfigurations) {
        if (this.vpceConfigurations == null) {
            setVpceConfigurations(new java.util.ArrayList<VPCEConfiguration>(vpceConfigurations.length));
        }
        for (VPCEConfiguration ele : vpceConfigurations) {
            this.vpceConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>VPCEConfiguration</code> objects containing information about your VPC endpoint configuration.
     * </p>
     * 
     * @param vpceConfigurations
     *        An array of <code>VPCEConfiguration</code> objects containing information about your VPC endpoint
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVPCEConfigurationsResult withVpceConfigurations(java.util.Collection<VPCEConfiguration> vpceConfigurations) {
        setVpceConfigurations(vpceConfigurations);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVPCEConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getVpceConfigurations() != null)
            sb.append("VpceConfigurations: ").append(getVpceConfigurations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVPCEConfigurationsResult == false)
            return false;
        ListVPCEConfigurationsResult other = (ListVPCEConfigurationsResult) obj;
        if (other.getVpceConfigurations() == null ^ this.getVpceConfigurations() == null)
            return false;
        if (other.getVpceConfigurations() != null && other.getVpceConfigurations().equals(this.getVpceConfigurations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpceConfigurations() == null) ? 0 : getVpceConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVPCEConfigurationsResult clone() {
        try {
            return (ListVPCEConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
