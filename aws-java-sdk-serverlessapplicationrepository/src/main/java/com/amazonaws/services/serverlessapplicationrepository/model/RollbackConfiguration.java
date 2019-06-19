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
 * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
 * >RollbackConfiguration</a> </i> Data Type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/RollbackConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RollbackConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     * >RollbackConfiguration</a> </i> Data Type.
     * </p>
     */
    private Integer monitoringTimeInMinutes;
    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     * >RollbackConfiguration</a> </i> Data Type.
     * </p>
     */
    private java.util.List<RollbackTrigger> rollbackTriggers;

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     * >RollbackConfiguration</a> </i> Data Type.
     * </p>
     * 
     * @param monitoringTimeInMinutes
     *        This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     *        >RollbackConfiguration</a> </i> Data Type.
     */

    public void setMonitoringTimeInMinutes(Integer monitoringTimeInMinutes) {
        this.monitoringTimeInMinutes = monitoringTimeInMinutes;
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     * >RollbackConfiguration</a> </i> Data Type.
     * </p>
     * 
     * @return This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     *         >RollbackConfiguration</a> </i> Data Type.
     */

    public Integer getMonitoringTimeInMinutes() {
        return this.monitoringTimeInMinutes;
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     * >RollbackConfiguration</a> </i> Data Type.
     * </p>
     * 
     * @param monitoringTimeInMinutes
     *        This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     *        >RollbackConfiguration</a> </i> Data Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackConfiguration withMonitoringTimeInMinutes(Integer monitoringTimeInMinutes) {
        setMonitoringTimeInMinutes(monitoringTimeInMinutes);
        return this;
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     * >RollbackConfiguration</a> </i> Data Type.
     * </p>
     * 
     * @return This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     *         >RollbackConfiguration</a> </i> Data Type.
     */

    public java.util.List<RollbackTrigger> getRollbackTriggers() {
        return rollbackTriggers;
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     * >RollbackConfiguration</a> </i> Data Type.
     * </p>
     * 
     * @param rollbackTriggers
     *        This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     *        >RollbackConfiguration</a> </i> Data Type.
     */

    public void setRollbackTriggers(java.util.Collection<RollbackTrigger> rollbackTriggers) {
        if (rollbackTriggers == null) {
            this.rollbackTriggers = null;
            return;
        }

        this.rollbackTriggers = new java.util.ArrayList<RollbackTrigger>(rollbackTriggers);
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     * >RollbackConfiguration</a> </i> Data Type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRollbackTriggers(java.util.Collection)} or {@link #withRollbackTriggers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param rollbackTriggers
     *        This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     *        >RollbackConfiguration</a> </i> Data Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackConfiguration withRollbackTriggers(RollbackTrigger... rollbackTriggers) {
        if (this.rollbackTriggers == null) {
            setRollbackTriggers(new java.util.ArrayList<RollbackTrigger>(rollbackTriggers.length));
        }
        for (RollbackTrigger ele : rollbackTriggers) {
            this.rollbackTriggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     * >RollbackConfiguration</a> </i> Data Type.
     * </p>
     * 
     * @param rollbackTriggers
     *        This property corresponds to the content of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration"
     *        >RollbackConfiguration</a> </i> Data Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackConfiguration withRollbackTriggers(java.util.Collection<RollbackTrigger> rollbackTriggers) {
        setRollbackTriggers(rollbackTriggers);
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
        if (getMonitoringTimeInMinutes() != null)
            sb.append("MonitoringTimeInMinutes: ").append(getMonitoringTimeInMinutes()).append(",");
        if (getRollbackTriggers() != null)
            sb.append("RollbackTriggers: ").append(getRollbackTriggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollbackConfiguration == false)
            return false;
        RollbackConfiguration other = (RollbackConfiguration) obj;
        if (other.getMonitoringTimeInMinutes() == null ^ this.getMonitoringTimeInMinutes() == null)
            return false;
        if (other.getMonitoringTimeInMinutes() != null && other.getMonitoringTimeInMinutes().equals(this.getMonitoringTimeInMinutes()) == false)
            return false;
        if (other.getRollbackTriggers() == null ^ this.getRollbackTriggers() == null)
            return false;
        if (other.getRollbackTriggers() != null && other.getRollbackTriggers().equals(this.getRollbackTriggers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringTimeInMinutes() == null) ? 0 : getMonitoringTimeInMinutes().hashCode());
        hashCode = prime * hashCode + ((getRollbackTriggers() == null) ? 0 : getRollbackTriggers().hashCode());
        return hashCode;
    }

    @Override
    public RollbackConfiguration clone() {
        try {
            return (RollbackConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.serverlessapplicationrepository.model.transform.RollbackConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
