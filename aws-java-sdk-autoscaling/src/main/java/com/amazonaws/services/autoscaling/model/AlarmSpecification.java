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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies the CloudWatch alarm specification to use in an instance refresh.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AlarmSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The names of one or more CloudWatch alarms to monitor for the instance refresh. You can specify up to 10 alarms.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarms;

    /**
     * <p>
     * The names of one or more CloudWatch alarms to monitor for the instance refresh. You can specify up to 10 alarms.
     * </p>
     * 
     * @return The names of one or more CloudWatch alarms to monitor for the instance refresh. You can specify up to 10
     *         alarms.
     */

    public java.util.List<String> getAlarms() {
        if (alarms == null) {
            alarms = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarms;
    }

    /**
     * <p>
     * The names of one or more CloudWatch alarms to monitor for the instance refresh. You can specify up to 10 alarms.
     * </p>
     * 
     * @param alarms
     *        The names of one or more CloudWatch alarms to monitor for the instance refresh. You can specify up to 10
     *        alarms.
     */

    public void setAlarms(java.util.Collection<String> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }

        this.alarms = new com.amazonaws.internal.SdkInternalList<String>(alarms);
    }

    /**
     * <p>
     * The names of one or more CloudWatch alarms to monitor for the instance refresh. You can specify up to 10 alarms.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarms(java.util.Collection)} or {@link #withAlarms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param alarms
     *        The names of one or more CloudWatch alarms to monitor for the instance refresh. You can specify up to 10
     *        alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmSpecification withAlarms(String... alarms) {
        if (this.alarms == null) {
            setAlarms(new com.amazonaws.internal.SdkInternalList<String>(alarms.length));
        }
        for (String ele : alarms) {
            this.alarms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more CloudWatch alarms to monitor for the instance refresh. You can specify up to 10 alarms.
     * </p>
     * 
     * @param alarms
     *        The names of one or more CloudWatch alarms to monitor for the instance refresh. You can specify up to 10
     *        alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmSpecification withAlarms(java.util.Collection<String> alarms) {
        setAlarms(alarms);
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
        if (getAlarms() != null)
            sb.append("Alarms: ").append(getAlarms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmSpecification == false)
            return false;
        AlarmSpecification other = (AlarmSpecification) obj;
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        return hashCode;
    }

    @Override
    public AlarmSpecification clone() {
        try {
            return (AlarmSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
