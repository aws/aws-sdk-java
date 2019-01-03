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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * PrincipalIdFormat description
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PrincipalIdFormat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrincipalIdFormat implements Serializable, Cloneable {

    /**
     * <p>
     * PrincipalIdFormatARN description
     * </p>
     */
    private String arn;
    /**
     * <p>
     * PrincipalIdFormatStatuses description
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IdFormat> statuses;

    /**
     * <p>
     * PrincipalIdFormatARN description
     * </p>
     * 
     * @param arn
     *        PrincipalIdFormatARN description
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * PrincipalIdFormatARN description
     * </p>
     * 
     * @return PrincipalIdFormatARN description
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * PrincipalIdFormatARN description
     * </p>
     * 
     * @param arn
     *        PrincipalIdFormatARN description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrincipalIdFormat withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * PrincipalIdFormatStatuses description
     * </p>
     * 
     * @return PrincipalIdFormatStatuses description
     */

    public java.util.List<IdFormat> getStatuses() {
        if (statuses == null) {
            statuses = new com.amazonaws.internal.SdkInternalList<IdFormat>();
        }
        return statuses;
    }

    /**
     * <p>
     * PrincipalIdFormatStatuses description
     * </p>
     * 
     * @param statuses
     *        PrincipalIdFormatStatuses description
     */

    public void setStatuses(java.util.Collection<IdFormat> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }

        this.statuses = new com.amazonaws.internal.SdkInternalList<IdFormat>(statuses);
    }

    /**
     * <p>
     * PrincipalIdFormatStatuses description
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatuses(java.util.Collection)} or {@link #withStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param statuses
     *        PrincipalIdFormatStatuses description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrincipalIdFormat withStatuses(IdFormat... statuses) {
        if (this.statuses == null) {
            setStatuses(new com.amazonaws.internal.SdkInternalList<IdFormat>(statuses.length));
        }
        for (IdFormat ele : statuses) {
            this.statuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * PrincipalIdFormatStatuses description
     * </p>
     * 
     * @param statuses
     *        PrincipalIdFormatStatuses description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrincipalIdFormat withStatuses(java.util.Collection<IdFormat> statuses) {
        setStatuses(statuses);
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
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrincipalIdFormat == false)
            return false;
        PrincipalIdFormat other = (PrincipalIdFormat) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public PrincipalIdFormat clone() {
        try {
            return (PrincipalIdFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
