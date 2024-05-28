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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTopicRefresh" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTopicRefreshRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic whose refresh you want to describe.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the topic that you want to describe. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     */
    private String topicId;
    /**
     * <p>
     * The ID of the refresh, which is performed when the topic is created or updated.
     * </p>
     */
    private String refreshId;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic whose refresh you want to describe.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the topic whose refresh you want to describe.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic whose refresh you want to describe.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the topic whose refresh you want to describe.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the topic whose refresh you want to describe.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the topic whose refresh you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTopicRefreshRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the topic that you want to describe. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     * 
     * @param topicId
     *        The ID of the topic that you want to describe. This ID is unique per Amazon Web Services Region for each
     *        Amazon Web Services account.
     */

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * <p>
     * The ID of the topic that you want to describe. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     * 
     * @return The ID of the topic that you want to describe. This ID is unique per Amazon Web Services Region for each
     *         Amazon Web Services account.
     */

    public String getTopicId() {
        return this.topicId;
    }

    /**
     * <p>
     * The ID of the topic that you want to describe. This ID is unique per Amazon Web Services Region for each Amazon
     * Web Services account.
     * </p>
     * 
     * @param topicId
     *        The ID of the topic that you want to describe. This ID is unique per Amazon Web Services Region for each
     *        Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTopicRefreshRequest withTopicId(String topicId) {
        setTopicId(topicId);
        return this;
    }

    /**
     * <p>
     * The ID of the refresh, which is performed when the topic is created or updated.
     * </p>
     * 
     * @param refreshId
     *        The ID of the refresh, which is performed when the topic is created or updated.
     */

    public void setRefreshId(String refreshId) {
        this.refreshId = refreshId;
    }

    /**
     * <p>
     * The ID of the refresh, which is performed when the topic is created or updated.
     * </p>
     * 
     * @return The ID of the refresh, which is performed when the topic is created or updated.
     */

    public String getRefreshId() {
        return this.refreshId;
    }

    /**
     * <p>
     * The ID of the refresh, which is performed when the topic is created or updated.
     * </p>
     * 
     * @param refreshId
     *        The ID of the refresh, which is performed when the topic is created or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTopicRefreshRequest withRefreshId(String refreshId) {
        setRefreshId(refreshId);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getTopicId() != null)
            sb.append("TopicId: ").append(getTopicId()).append(",");
        if (getRefreshId() != null)
            sb.append("RefreshId: ").append(getRefreshId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTopicRefreshRequest == false)
            return false;
        DescribeTopicRefreshRequest other = (DescribeTopicRefreshRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTopicId() == null ^ this.getTopicId() == null)
            return false;
        if (other.getTopicId() != null && other.getTopicId().equals(this.getTopicId()) == false)
            return false;
        if (other.getRefreshId() == null ^ this.getRefreshId() == null)
            return false;
        if (other.getRefreshId() != null && other.getRefreshId().equals(this.getRefreshId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        hashCode = prime * hashCode + ((getRefreshId() == null) ? 0 : getRefreshId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTopicRefreshRequest clone() {
        return (DescribeTopicRefreshRequest) super.clone();
    }

}
