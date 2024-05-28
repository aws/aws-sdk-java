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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/StartInvestigation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartInvestigationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     * </p>
     */
    private String entityArn;
    /**
     * <p>
     * The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    private java.util.Date scopeStartTime;
    /**
     * <p>
     * The data and time when the investigation ended. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    private java.util.Date scopeEndTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The Amazon Resource Name (ARN) of the behavior graph.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the behavior graph.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The Amazon Resource Name (ARN) of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInvestigationRequest withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     * </p>
     * 
     * @param entityArn
     *        The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     */

    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     */

    public String getEntityArn() {
        return this.entityArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     * </p>
     * 
     * @param entityArn
     *        The unique Amazon Resource Name (ARN) of the IAM user and IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInvestigationRequest withEntityArn(String entityArn) {
        setEntityArn(entityArn);
        return this;
    }

    /**
     * <p>
     * The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param scopeStartTime
     *        The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     *        <code>2021-08-18T16:35:56.284Z</code>.
     */

    public void setScopeStartTime(java.util.Date scopeStartTime) {
        this.scopeStartTime = scopeStartTime;
    }

    /**
     * <p>
     * The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For
     *         example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public java.util.Date getScopeStartTime() {
        return this.scopeStartTime;
    }

    /**
     * <p>
     * The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param scopeStartTime
     *        The data and time when the investigation began. The value is an UTC ISO8601 formatted string. For example,
     *        <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInvestigationRequest withScopeStartTime(java.util.Date scopeStartTime) {
        setScopeStartTime(scopeStartTime);
        return this;
    }

    /**
     * <p>
     * The data and time when the investigation ended. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param scopeEndTime
     *        The data and time when the investigation ended. The value is an UTC ISO8601 formatted string. For example,
     *        <code>2021-08-18T16:35:56.284Z</code>.
     */

    public void setScopeEndTime(java.util.Date scopeEndTime) {
        this.scopeEndTime = scopeEndTime;
    }

    /**
     * <p>
     * The data and time when the investigation ended. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The data and time when the investigation ended. The value is an UTC ISO8601 formatted string. For
     *         example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public java.util.Date getScopeEndTime() {
        return this.scopeEndTime;
    }

    /**
     * <p>
     * The data and time when the investigation ended. The value is an UTC ISO8601 formatted string. For example,
     * <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param scopeEndTime
     *        The data and time when the investigation ended. The value is an UTC ISO8601 formatted string. For example,
     *        <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartInvestigationRequest withScopeEndTime(java.util.Date scopeEndTime) {
        setScopeEndTime(scopeEndTime);
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getEntityArn() != null)
            sb.append("EntityArn: ").append(getEntityArn()).append(",");
        if (getScopeStartTime() != null)
            sb.append("ScopeStartTime: ").append(getScopeStartTime()).append(",");
        if (getScopeEndTime() != null)
            sb.append("ScopeEndTime: ").append(getScopeEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartInvestigationRequest == false)
            return false;
        StartInvestigationRequest other = (StartInvestigationRequest) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null)
            return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false)
            return false;
        if (other.getScopeStartTime() == null ^ this.getScopeStartTime() == null)
            return false;
        if (other.getScopeStartTime() != null && other.getScopeStartTime().equals(this.getScopeStartTime()) == false)
            return false;
        if (other.getScopeEndTime() == null ^ this.getScopeEndTime() == null)
            return false;
        if (other.getScopeEndTime() != null && other.getScopeEndTime().equals(this.getScopeEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getScopeStartTime() == null) ? 0 : getScopeStartTime().hashCode());
        hashCode = prime * hashCode + ((getScopeEndTime() == null) ? 0 : getScopeEndTime().hashCode());
        return hashCode;
    }

    @Override
    public StartInvestigationRequest clone() {
        return (StartInvestigationRequest) super.clone();
    }

}
