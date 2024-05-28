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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/PublishStateMachineVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishStateMachineVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date the version was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) (ARN) that identifies the state machine version.
     * </p>
     */
    private String stateMachineVersionArn;

    /**
     * <p>
     * The date the version was created.
     * </p>
     * 
     * @param creationDate
     *        The date the version was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the version was created.
     * </p>
     * 
     * @return The date the version was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the version was created.
     * </p>
     * 
     * @param creationDate
     *        The date the version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishStateMachineVersionResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) (ARN) that identifies the state machine version.
     * </p>
     * 
     * @param stateMachineVersionArn
     *        The Amazon Resource Name (ARN) (ARN) that identifies the state machine version.
     */

    public void setStateMachineVersionArn(String stateMachineVersionArn) {
        this.stateMachineVersionArn = stateMachineVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) (ARN) that identifies the state machine version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) (ARN) that identifies the state machine version.
     */

    public String getStateMachineVersionArn() {
        return this.stateMachineVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) (ARN) that identifies the state machine version.
     * </p>
     * 
     * @param stateMachineVersionArn
     *        The Amazon Resource Name (ARN) (ARN) that identifies the state machine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishStateMachineVersionResult withStateMachineVersionArn(String stateMachineVersionArn) {
        setStateMachineVersionArn(stateMachineVersionArn);
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
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getStateMachineVersionArn() != null)
            sb.append("StateMachineVersionArn: ").append(getStateMachineVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishStateMachineVersionResult == false)
            return false;
        PublishStateMachineVersionResult other = (PublishStateMachineVersionResult) obj;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getStateMachineVersionArn() == null ^ this.getStateMachineVersionArn() == null)
            return false;
        if (other.getStateMachineVersionArn() != null && other.getStateMachineVersionArn().equals(this.getStateMachineVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getStateMachineVersionArn() == null) ? 0 : getStateMachineVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public PublishStateMachineVersionResult clone() {
        try {
            return (PublishStateMachineVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
