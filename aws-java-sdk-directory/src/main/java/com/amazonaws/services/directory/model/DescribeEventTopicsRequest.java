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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes event topics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeEventTopics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventTopicsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Directory ID for which to get the list of associated SNS topics. If this member is null, associations for all
     * Directory IDs are returned.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the
     * specified Directory ID are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being thrown.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> topicNames;

    /**
     * <p>
     * The Directory ID for which to get the list of associated SNS topics. If this member is null, associations for all
     * Directory IDs are returned.
     * </p>
     * 
     * @param directoryId
     *        The Directory ID for which to get the list of associated SNS topics. If this member is null, associations
     *        for all Directory IDs are returned.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The Directory ID for which to get the list of associated SNS topics. If this member is null, associations for all
     * Directory IDs are returned.
     * </p>
     * 
     * @return The Directory ID for which to get the list of associated SNS topics. If this member is null, associations
     *         for all Directory IDs are returned.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The Directory ID for which to get the list of associated SNS topics. If this member is null, associations for all
     * Directory IDs are returned.
     * </p>
     * 
     * @param directoryId
     *        The Directory ID for which to get the list of associated SNS topics. If this member is null, associations
     *        for all Directory IDs are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventTopicsRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the
     * specified Directory ID are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being thrown.
     * </p>
     * 
     * @return A list of SNS topic names for which to obtain the information. If this member is null, all associations
     *         for the specified Directory ID are returned.</p>
     *         <p>
     *         An empty list results in an <code>InvalidParameterException</code> being thrown.
     */

    public java.util.List<String> getTopicNames() {
        if (topicNames == null) {
            topicNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return topicNames;
    }

    /**
     * <p>
     * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the
     * specified Directory ID are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being thrown.
     * </p>
     * 
     * @param topicNames
     *        A list of SNS topic names for which to obtain the information. If this member is null, all associations
     *        for the specified Directory ID are returned.</p>
     *        <p>
     *        An empty list results in an <code>InvalidParameterException</code> being thrown.
     */

    public void setTopicNames(java.util.Collection<String> topicNames) {
        if (topicNames == null) {
            this.topicNames = null;
            return;
        }

        this.topicNames = new com.amazonaws.internal.SdkInternalList<String>(topicNames);
    }

    /**
     * <p>
     * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the
     * specified Directory ID are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being thrown.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopicNames(java.util.Collection)} or {@link #withTopicNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param topicNames
     *        A list of SNS topic names for which to obtain the information. If this member is null, all associations
     *        for the specified Directory ID are returned.</p>
     *        <p>
     *        An empty list results in an <code>InvalidParameterException</code> being thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventTopicsRequest withTopicNames(String... topicNames) {
        if (this.topicNames == null) {
            setTopicNames(new com.amazonaws.internal.SdkInternalList<String>(topicNames.length));
        }
        for (String ele : topicNames) {
            this.topicNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the
     * specified Directory ID are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being thrown.
     * </p>
     * 
     * @param topicNames
     *        A list of SNS topic names for which to obtain the information. If this member is null, all associations
     *        for the specified Directory ID are returned.</p>
     *        <p>
     *        An empty list results in an <code>InvalidParameterException</code> being thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventTopicsRequest withTopicNames(java.util.Collection<String> topicNames) {
        setTopicNames(topicNames);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getTopicNames() != null)
            sb.append("TopicNames: ").append(getTopicNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventTopicsRequest == false)
            return false;
        DescribeEventTopicsRequest other = (DescribeEventTopicsRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getTopicNames() == null ^ this.getTopicNames() == null)
            return false;
        if (other.getTopicNames() != null && other.getTopicNames().equals(this.getTopicNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getTopicNames() == null) ? 0 : getTopicNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventTopicsRequest clone() {
        return (DescribeEventTopicsRequest) super.clone();
    }

}
