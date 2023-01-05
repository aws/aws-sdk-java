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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the information about whether the app monitor stores copies of the data that RUM collects
 * in CloudWatch Logs. If it does, this structure also contains the name of the log group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/CwLog" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CwLog implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicated whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs.
     * </p>
     */
    private Boolean cwLogEnabled;
    /**
     * <p>
     * The name of the log group where the copies are stored.
     * </p>
     */
    private String cwLogGroup;

    /**
     * <p>
     * Indicated whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs.
     * </p>
     * 
     * @param cwLogEnabled
     *        Indicated whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs.
     */

    public void setCwLogEnabled(Boolean cwLogEnabled) {
        this.cwLogEnabled = cwLogEnabled;
    }

    /**
     * <p>
     * Indicated whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs.
     * </p>
     * 
     * @return Indicated whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs.
     */

    public Boolean getCwLogEnabled() {
        return this.cwLogEnabled;
    }

    /**
     * <p>
     * Indicated whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs.
     * </p>
     * 
     * @param cwLogEnabled
     *        Indicated whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CwLog withCwLogEnabled(Boolean cwLogEnabled) {
        setCwLogEnabled(cwLogEnabled);
        return this;
    }

    /**
     * <p>
     * Indicated whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs.
     * </p>
     * 
     * @return Indicated whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs.
     */

    public Boolean isCwLogEnabled() {
        return this.cwLogEnabled;
    }

    /**
     * <p>
     * The name of the log group where the copies are stored.
     * </p>
     * 
     * @param cwLogGroup
     *        The name of the log group where the copies are stored.
     */

    public void setCwLogGroup(String cwLogGroup) {
        this.cwLogGroup = cwLogGroup;
    }

    /**
     * <p>
     * The name of the log group where the copies are stored.
     * </p>
     * 
     * @return The name of the log group where the copies are stored.
     */

    public String getCwLogGroup() {
        return this.cwLogGroup;
    }

    /**
     * <p>
     * The name of the log group where the copies are stored.
     * </p>
     * 
     * @param cwLogGroup
     *        The name of the log group where the copies are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CwLog withCwLogGroup(String cwLogGroup) {
        setCwLogGroup(cwLogGroup);
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
        if (getCwLogEnabled() != null)
            sb.append("CwLogEnabled: ").append(getCwLogEnabled()).append(",");
        if (getCwLogGroup() != null)
            sb.append("CwLogGroup: ").append(getCwLogGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CwLog == false)
            return false;
        CwLog other = (CwLog) obj;
        if (other.getCwLogEnabled() == null ^ this.getCwLogEnabled() == null)
            return false;
        if (other.getCwLogEnabled() != null && other.getCwLogEnabled().equals(this.getCwLogEnabled()) == false)
            return false;
        if (other.getCwLogGroup() == null ^ this.getCwLogGroup() == null)
            return false;
        if (other.getCwLogGroup() != null && other.getCwLogGroup().equals(this.getCwLogGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCwLogEnabled() == null) ? 0 : getCwLogEnabled().hashCode());
        hashCode = prime * hashCode + ((getCwLogGroup() == null) ? 0 : getCwLogGroup().hashCode());
        return hashCode;
    }

    @Override
    public CwLog clone() {
        try {
            return (CwLog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.CwLogMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
