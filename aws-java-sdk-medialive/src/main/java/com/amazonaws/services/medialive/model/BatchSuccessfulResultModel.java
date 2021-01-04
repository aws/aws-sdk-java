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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Details from a successful operation
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchSuccessfulResultModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchSuccessfulResultModel implements Serializable, Cloneable, StructuredPojo {

    /** ARN of the resource */
    private String arn;
    /** ID of the resource */
    private String id;
    /** Current state of the resource */
    private String state;

    /**
     * ARN of the resource
     * 
     * @param arn
     *        ARN of the resource
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * ARN of the resource
     * 
     * @return ARN of the resource
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * ARN of the resource
     * 
     * @param arn
     *        ARN of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchSuccessfulResultModel withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * ID of the resource
     * 
     * @param id
     *        ID of the resource
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * ID of the resource
     * 
     * @return ID of the resource
     */

    public String getId() {
        return this.id;
    }

    /**
     * ID of the resource
     * 
     * @param id
     *        ID of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchSuccessfulResultModel withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Current state of the resource
     * 
     * @param state
     *        Current state of the resource
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * Current state of the resource
     * 
     * @return Current state of the resource
     */

    public String getState() {
        return this.state;
    }

    /**
     * Current state of the resource
     * 
     * @param state
     *        Current state of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchSuccessfulResultModel withState(String state) {
        setState(state);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchSuccessfulResultModel == false)
            return false;
        BatchSuccessfulResultModel other = (BatchSuccessfulResultModel) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public BatchSuccessfulResultModel clone() {
        try {
            return (BatchSuccessfulResultModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.BatchSuccessfulResultModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
