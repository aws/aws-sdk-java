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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/PutResourcePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String actionType;
    /** <p/> */
    private String sourceResourceArn;
    /** <p/> */
    private String resourceArn;

    /**
     * <p/>
     * 
     * @param actionType
     * @see PermissionActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see PermissionActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p/>
     * 
     * @param actionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionActionType
     */

    public PutResourcePermissionRequest withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param actionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionActionType
     */

    public PutResourcePermissionRequest withActionType(PermissionActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param sourceResourceArn
     */

    public void setSourceResourceArn(String sourceResourceArn) {
        this.sourceResourceArn = sourceResourceArn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSourceResourceArn() {
        return this.sourceResourceArn;
    }

    /**
     * <p/>
     * 
     * @param sourceResourceArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePermissionRequest withSourceResourceArn(String sourceResourceArn) {
        setSourceResourceArn(sourceResourceArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param resourceArn
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p/>
     * 
     * @param resourceArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePermissionRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getSourceResourceArn() != null)
            sb.append("SourceResourceArn: ").append(getSourceResourceArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePermissionRequest == false)
            return false;
        PutResourcePermissionRequest other = (PutResourcePermissionRequest) obj;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getSourceResourceArn() == null ^ this.getSourceResourceArn() == null)
            return false;
        if (other.getSourceResourceArn() != null && other.getSourceResourceArn().equals(this.getSourceResourceArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getSourceResourceArn() == null) ? 0 : getSourceResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePermissionRequest clone() {
        return (PutResourcePermissionRequest) super.clone();
    }

}
