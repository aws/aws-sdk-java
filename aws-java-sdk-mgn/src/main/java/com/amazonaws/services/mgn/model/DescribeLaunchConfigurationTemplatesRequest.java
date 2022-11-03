/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeLaunchConfigurationTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLaunchConfigurationTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     */
    private java.util.List<String> launchConfigurationTemplateIDs;
    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     * 
     * @return Request to disconnect Source Server from service by Server ID.
     */

    public java.util.List<String> getLaunchConfigurationTemplateIDs() {
        return launchConfigurationTemplateIDs;
    }

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     * 
     * @param launchConfigurationTemplateIDs
     *        Request to disconnect Source Server from service by Server ID.
     */

    public void setLaunchConfigurationTemplateIDs(java.util.Collection<String> launchConfigurationTemplateIDs) {
        if (launchConfigurationTemplateIDs == null) {
            this.launchConfigurationTemplateIDs = null;
            return;
        }

        this.launchConfigurationTemplateIDs = new java.util.ArrayList<String>(launchConfigurationTemplateIDs);
    }

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchConfigurationTemplateIDs(java.util.Collection)} or
     * {@link #withLaunchConfigurationTemplateIDs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param launchConfigurationTemplateIDs
     *        Request to disconnect Source Server from service by Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchConfigurationTemplatesRequest withLaunchConfigurationTemplateIDs(String... launchConfigurationTemplateIDs) {
        if (this.launchConfigurationTemplateIDs == null) {
            setLaunchConfigurationTemplateIDs(new java.util.ArrayList<String>(launchConfigurationTemplateIDs.length));
        }
        for (String ele : launchConfigurationTemplateIDs) {
            this.launchConfigurationTemplateIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     * 
     * @param launchConfigurationTemplateIDs
     *        Request to disconnect Source Server from service by Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchConfigurationTemplatesRequest withLaunchConfigurationTemplateIDs(java.util.Collection<String> launchConfigurationTemplateIDs) {
        setLaunchConfigurationTemplateIDs(launchConfigurationTemplateIDs);
        return this;
    }

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     * 
     * @param maxResults
     *        Request to disconnect Source Server from service by Server ID.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     * 
     * @return Request to disconnect Source Server from service by Server ID.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     * 
     * @param maxResults
     *        Request to disconnect Source Server from service by Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchConfigurationTemplatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     * 
     * @param nextToken
     *        Request to disconnect Source Server from service by Server ID.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     * 
     * @return Request to disconnect Source Server from service by Server ID.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Request to disconnect Source Server from service by Server ID.
     * </p>
     * 
     * @param nextToken
     *        Request to disconnect Source Server from service by Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLaunchConfigurationTemplatesRequest withNextToken(String nextToken) {
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
        if (getLaunchConfigurationTemplateIDs() != null)
            sb.append("LaunchConfigurationTemplateIDs: ").append(getLaunchConfigurationTemplateIDs()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeLaunchConfigurationTemplatesRequest == false)
            return false;
        DescribeLaunchConfigurationTemplatesRequest other = (DescribeLaunchConfigurationTemplatesRequest) obj;
        if (other.getLaunchConfigurationTemplateIDs() == null ^ this.getLaunchConfigurationTemplateIDs() == null)
            return false;
        if (other.getLaunchConfigurationTemplateIDs() != null
                && other.getLaunchConfigurationTemplateIDs().equals(this.getLaunchConfigurationTemplateIDs()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getLaunchConfigurationTemplateIDs() == null) ? 0 : getLaunchConfigurationTemplateIDs().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLaunchConfigurationTemplatesRequest clone() {
        return (DescribeLaunchConfigurationTemplatesRequest) super.clone();
    }

}
