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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatasetActionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetActionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the action which automatically creates the data set's contents.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The type of action by which the data set's contents are automatically created.
     * </p>
     */
    private String actionType;

    /**
     * <p>
     * The name of the action which automatically creates the data set's contents.
     * </p>
     * 
     * @param actionName
     *        The name of the action which automatically creates the data set's contents.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action which automatically creates the data set's contents.
     * </p>
     * 
     * @return The name of the action which automatically creates the data set's contents.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action which automatically creates the data set's contents.
     * </p>
     * 
     * @param actionName
     *        The name of the action which automatically creates the data set's contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetActionSummary withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The type of action by which the data set's contents are automatically created.
     * </p>
     * 
     * @param actionType
     *        The type of action by which the data set's contents are automatically created.
     * @see DatasetActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of action by which the data set's contents are automatically created.
     * </p>
     * 
     * @return The type of action by which the data set's contents are automatically created.
     * @see DatasetActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of action by which the data set's contents are automatically created.
     * </p>
     * 
     * @param actionType
     *        The type of action by which the data set's contents are automatically created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetActionType
     */

    public DatasetActionSummary withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The type of action by which the data set's contents are automatically created.
     * </p>
     * 
     * @param actionType
     *        The type of action by which the data set's contents are automatically created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetActionType
     */

    public DatasetActionSummary withActionType(DatasetActionType actionType) {
        this.actionType = actionType.toString();
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetActionSummary == false)
            return false;
        DatasetActionSummary other = (DatasetActionSummary) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        return hashCode;
    }

    @Override
    public DatasetActionSummary clone() {
        try {
            return (DatasetActionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetActionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
