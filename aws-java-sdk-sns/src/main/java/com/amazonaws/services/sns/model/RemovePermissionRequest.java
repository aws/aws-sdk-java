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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for RemovePermission action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/RemovePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemovePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The unique label of the statement you want to remove.
     * </p>
     */
    private String label;

    /**
     * Default constructor for RemovePermissionRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public RemovePermissionRequest() {
    }

    /**
     * Constructs a new RemovePermissionRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param topicArn
     *        The ARN of the topic whose access control policy you wish to modify.
     * @param label
     *        The unique label of the statement you want to remove.
     */
    public RemovePermissionRequest(String topicArn, String label) {
        setTopicArn(topicArn);
        setLabel(label);
    }

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic whose access control policy you wish to modify.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     * 
     * @return The ARN of the topic whose access control policy you wish to modify.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The ARN of the topic whose access control policy you wish to modify.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic whose access control policy you wish to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The unique label of the statement you want to remove.
     * </p>
     * 
     * @param label
     *        The unique label of the statement you want to remove.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The unique label of the statement you want to remove.
     * </p>
     * 
     * @return The unique label of the statement you want to remove.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The unique label of the statement you want to remove.
     * </p>
     * 
     * @param label
     *        The unique label of the statement you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemovePermissionRequest withLabel(String label) {
        setLabel(label);
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
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemovePermissionRequest == false)
            return false;
        RemovePermissionRequest other = (RemovePermissionRequest) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return hashCode;
    }

    @Override
    public RemovePermissionRequest clone() {
        return (RemovePermissionRequest) super.clone();
    }

}
