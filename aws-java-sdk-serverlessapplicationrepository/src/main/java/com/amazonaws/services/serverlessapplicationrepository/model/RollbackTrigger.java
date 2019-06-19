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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This property corresponds to the <i>AWS CloudFormation <a
 * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger">RollbackTrigger</a> </i>
 * Data Type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/RollbackTrigger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RollbackTrigger implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger">RollbackTrigger</a> </i>
     * Data Type.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger">RollbackTrigger</a> </i>
     * Data Type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger">RollbackTrigger</a> </i>
     * Data Type.
     * </p>
     * 
     * @param arn
     *        This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger"
     *        >RollbackTrigger</a> </i> Data Type.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger">RollbackTrigger</a> </i>
     * Data Type.
     * </p>
     * 
     * @return This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger"
     *         >RollbackTrigger</a> </i> Data Type.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger">RollbackTrigger</a> </i>
     * Data Type.
     * </p>
     * 
     * @param arn
     *        This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger"
     *        >RollbackTrigger</a> </i> Data Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackTrigger withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger">RollbackTrigger</a> </i>
     * Data Type.
     * </p>
     * 
     * @param type
     *        This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger"
     *        >RollbackTrigger</a> </i> Data Type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger">RollbackTrigger</a> </i>
     * Data Type.
     * </p>
     * 
     * @return This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger"
     *         >RollbackTrigger</a> </i> Data Type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger">RollbackTrigger</a> </i>
     * Data Type.
     * </p>
     * 
     * @param type
     *        This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger"
     *        >RollbackTrigger</a> </i> Data Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackTrigger withType(String type) {
        setType(type);
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollbackTrigger == false)
            return false;
        RollbackTrigger other = (RollbackTrigger) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RollbackTrigger clone() {
        try {
            return (RollbackTrigger) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.serverlessapplicationrepository.model.transform.RollbackTriggerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
