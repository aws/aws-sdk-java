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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeProtectConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProtectConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array of ProtectConfigurationInformation objects that contain the details for the request.
     * </p>
     */
    private java.util.List<ProtectConfigurationInformation> protectConfigurations;
    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of ProtectConfigurationInformation objects that contain the details for the request.
     * </p>
     * 
     * @return An array of ProtectConfigurationInformation objects that contain the details for the request.
     */

    public java.util.List<ProtectConfigurationInformation> getProtectConfigurations() {
        return protectConfigurations;
    }

    /**
     * <p>
     * An array of ProtectConfigurationInformation objects that contain the details for the request.
     * </p>
     * 
     * @param protectConfigurations
     *        An array of ProtectConfigurationInformation objects that contain the details for the request.
     */

    public void setProtectConfigurations(java.util.Collection<ProtectConfigurationInformation> protectConfigurations) {
        if (protectConfigurations == null) {
            this.protectConfigurations = null;
            return;
        }

        this.protectConfigurations = new java.util.ArrayList<ProtectConfigurationInformation>(protectConfigurations);
    }

    /**
     * <p>
     * An array of ProtectConfigurationInformation objects that contain the details for the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtectConfigurations(java.util.Collection)} or
     * {@link #withProtectConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param protectConfigurations
     *        An array of ProtectConfigurationInformation objects that contain the details for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectConfigurationsResult withProtectConfigurations(ProtectConfigurationInformation... protectConfigurations) {
        if (this.protectConfigurations == null) {
            setProtectConfigurations(new java.util.ArrayList<ProtectConfigurationInformation>(protectConfigurations.length));
        }
        for (ProtectConfigurationInformation ele : protectConfigurations) {
            this.protectConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of ProtectConfigurationInformation objects that contain the details for the request.
     * </p>
     * 
     * @param protectConfigurations
     *        An array of ProtectConfigurationInformation objects that contain the details for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectConfigurationsResult withProtectConfigurations(java.util.Collection<ProtectConfigurationInformation> protectConfigurations) {
        setProtectConfigurations(protectConfigurations);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. You don't need to supply a value for this
     *         field in the initial request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectConfigurationsResult withNextToken(String nextToken) {
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
        if (getProtectConfigurations() != null)
            sb.append("ProtectConfigurations: ").append(getProtectConfigurations()).append(",");
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

        if (obj instanceof DescribeProtectConfigurationsResult == false)
            return false;
        DescribeProtectConfigurationsResult other = (DescribeProtectConfigurationsResult) obj;
        if (other.getProtectConfigurations() == null ^ this.getProtectConfigurations() == null)
            return false;
        if (other.getProtectConfigurations() != null && other.getProtectConfigurations().equals(this.getProtectConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getProtectConfigurations() == null) ? 0 : getProtectConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProtectConfigurationsResult clone() {
        try {
            return (DescribeProtectConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
