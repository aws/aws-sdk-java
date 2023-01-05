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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHubContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHubContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the hub that contains the content to describe.
     * </p>
     */
    private String hubName;
    /**
     * <p>
     * The type of content in the hub.
     * </p>
     */
    private String hubContentType;
    /**
     * <p>
     * The name of the content to describe.
     * </p>
     */
    private String hubContentName;
    /**
     * <p>
     * The version of the content to describe.
     * </p>
     */
    private String hubContentVersion;

    /**
     * <p>
     * The name of the hub that contains the content to describe.
     * </p>
     * 
     * @param hubName
     *        The name of the hub that contains the content to describe.
     */

    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    /**
     * <p>
     * The name of the hub that contains the content to describe.
     * </p>
     * 
     * @return The name of the hub that contains the content to describe.
     */

    public String getHubName() {
        return this.hubName;
    }

    /**
     * <p>
     * The name of the hub that contains the content to describe.
     * </p>
     * 
     * @param hubName
     *        The name of the hub that contains the content to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentRequest withHubName(String hubName) {
        setHubName(hubName);
        return this;
    }

    /**
     * <p>
     * The type of content in the hub.
     * </p>
     * 
     * @param hubContentType
     *        The type of content in the hub.
     * @see HubContentType
     */

    public void setHubContentType(String hubContentType) {
        this.hubContentType = hubContentType;
    }

    /**
     * <p>
     * The type of content in the hub.
     * </p>
     * 
     * @return The type of content in the hub.
     * @see HubContentType
     */

    public String getHubContentType() {
        return this.hubContentType;
    }

    /**
     * <p>
     * The type of content in the hub.
     * </p>
     * 
     * @param hubContentType
     *        The type of content in the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentType
     */

    public DescribeHubContentRequest withHubContentType(String hubContentType) {
        setHubContentType(hubContentType);
        return this;
    }

    /**
     * <p>
     * The type of content in the hub.
     * </p>
     * 
     * @param hubContentType
     *        The type of content in the hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HubContentType
     */

    public DescribeHubContentRequest withHubContentType(HubContentType hubContentType) {
        this.hubContentType = hubContentType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the content to describe.
     * </p>
     * 
     * @param hubContentName
     *        The name of the content to describe.
     */

    public void setHubContentName(String hubContentName) {
        this.hubContentName = hubContentName;
    }

    /**
     * <p>
     * The name of the content to describe.
     * </p>
     * 
     * @return The name of the content to describe.
     */

    public String getHubContentName() {
        return this.hubContentName;
    }

    /**
     * <p>
     * The name of the content to describe.
     * </p>
     * 
     * @param hubContentName
     *        The name of the content to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentRequest withHubContentName(String hubContentName) {
        setHubContentName(hubContentName);
        return this;
    }

    /**
     * <p>
     * The version of the content to describe.
     * </p>
     * 
     * @param hubContentVersion
     *        The version of the content to describe.
     */

    public void setHubContentVersion(String hubContentVersion) {
        this.hubContentVersion = hubContentVersion;
    }

    /**
     * <p>
     * The version of the content to describe.
     * </p>
     * 
     * @return The version of the content to describe.
     */

    public String getHubContentVersion() {
        return this.hubContentVersion;
    }

    /**
     * <p>
     * The version of the content to describe.
     * </p>
     * 
     * @param hubContentVersion
     *        The version of the content to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHubContentRequest withHubContentVersion(String hubContentVersion) {
        setHubContentVersion(hubContentVersion);
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
        if (getHubName() != null)
            sb.append("HubName: ").append(getHubName()).append(",");
        if (getHubContentType() != null)
            sb.append("HubContentType: ").append(getHubContentType()).append(",");
        if (getHubContentName() != null)
            sb.append("HubContentName: ").append(getHubContentName()).append(",");
        if (getHubContentVersion() != null)
            sb.append("HubContentVersion: ").append(getHubContentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHubContentRequest == false)
            return false;
        DescribeHubContentRequest other = (DescribeHubContentRequest) obj;
        if (other.getHubName() == null ^ this.getHubName() == null)
            return false;
        if (other.getHubName() != null && other.getHubName().equals(this.getHubName()) == false)
            return false;
        if (other.getHubContentType() == null ^ this.getHubContentType() == null)
            return false;
        if (other.getHubContentType() != null && other.getHubContentType().equals(this.getHubContentType()) == false)
            return false;
        if (other.getHubContentName() == null ^ this.getHubContentName() == null)
            return false;
        if (other.getHubContentName() != null && other.getHubContentName().equals(this.getHubContentName()) == false)
            return false;
        if (other.getHubContentVersion() == null ^ this.getHubContentVersion() == null)
            return false;
        if (other.getHubContentVersion() != null && other.getHubContentVersion().equals(this.getHubContentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHubName() == null) ? 0 : getHubName().hashCode());
        hashCode = prime * hashCode + ((getHubContentType() == null) ? 0 : getHubContentType().hashCode());
        hashCode = prime * hashCode + ((getHubContentName() == null) ? 0 : getHubContentName().hashCode());
        hashCode = prime * hashCode + ((getHubContentVersion() == null) ? 0 : getHubContentVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHubContentRequest clone() {
        return (DescribeHubContentRequest) super.clone();
    }

}
