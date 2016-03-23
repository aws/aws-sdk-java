/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest) ApplyPendingMaintenanceAction operation}.
 * <p>
 * Applies a pending maintenance action to a resource (for example, to a
 * DB instance).
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest)
 */
public class ApplyPendingMaintenanceActionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The RDS Amazon Resource Name (ARN) of the resource that the pending
     * maintenance action applies to. For information about creating an ARN,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    private String resourceIdentifier;

    /**
     * The pending maintenance action to apply to this resource. <p>Valid
     * values: <code>system-update</code>, <code>db-upgrade</code>
     */
    private String applyAction;

    /**
     * A value that specifies the type of opt-in request, or undoes an opt-in
     * request. An opt-in request of type <code>immediate</code> cannot be
     * undone. <p>Valid values: <ul> <li> <code>immediate</code> - Apply the
     * maintenance action immediately.</li> <li>
     * <code>next-maintenance</code> - Apply the maintenance action during
     * the next maintenance window for the resource.</li> <li>
     * <code>undo-opt-in</code> - Cancel any existing
     * <code>next-maintenance</code> opt-in requests.</li> </ul>
     */
    private String optInType;

    /**
     * The RDS Amazon Resource Name (ARN) of the resource that the pending
     * maintenance action applies to. For information about creating an ARN,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @return The RDS Amazon Resource Name (ARN) of the resource that the pending
     *         maintenance action applies to. For information about creating an ARN,
     *         see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    public String getResourceIdentifier() {
        return resourceIdentifier;
    }
    
    /**
     * The RDS Amazon Resource Name (ARN) of the resource that the pending
     * maintenance action applies to. For information about creating an ARN,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @param resourceIdentifier The RDS Amazon Resource Name (ARN) of the resource that the pending
     *         maintenance action applies to. For information about creating an ARN,
     *         see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }
    
    /**
     * The RDS Amazon Resource Name (ARN) of the resource that the pending
     * maintenance action applies to. For information about creating an ARN,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceIdentifier The RDS Amazon Resource Name (ARN) of the resource that the pending
     *         maintenance action applies to. For information about creating an ARN,
     *         see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ApplyPendingMaintenanceActionRequest withResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * The pending maintenance action to apply to this resource. <p>Valid
     * values: <code>system-update</code>, <code>db-upgrade</code>
     *
     * @return The pending maintenance action to apply to this resource. <p>Valid
     *         values: <code>system-update</code>, <code>db-upgrade</code>
     */
    public String getApplyAction() {
        return applyAction;
    }
    
    /**
     * The pending maintenance action to apply to this resource. <p>Valid
     * values: <code>system-update</code>, <code>db-upgrade</code>
     *
     * @param applyAction The pending maintenance action to apply to this resource. <p>Valid
     *         values: <code>system-update</code>, <code>db-upgrade</code>
     */
    public void setApplyAction(String applyAction) {
        this.applyAction = applyAction;
    }
    
    /**
     * The pending maintenance action to apply to this resource. <p>Valid
     * values: <code>system-update</code>, <code>db-upgrade</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyAction The pending maintenance action to apply to this resource. <p>Valid
     *         values: <code>system-update</code>, <code>db-upgrade</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ApplyPendingMaintenanceActionRequest withApplyAction(String applyAction) {
        this.applyAction = applyAction;
        return this;
    }

    /**
     * A value that specifies the type of opt-in request, or undoes an opt-in
     * request. An opt-in request of type <code>immediate</code> cannot be
     * undone. <p>Valid values: <ul> <li> <code>immediate</code> - Apply the
     * maintenance action immediately.</li> <li>
     * <code>next-maintenance</code> - Apply the maintenance action during
     * the next maintenance window for the resource.</li> <li>
     * <code>undo-opt-in</code> - Cancel any existing
     * <code>next-maintenance</code> opt-in requests.</li> </ul>
     *
     * @return A value that specifies the type of opt-in request, or undoes an opt-in
     *         request. An opt-in request of type <code>immediate</code> cannot be
     *         undone. <p>Valid values: <ul> <li> <code>immediate</code> - Apply the
     *         maintenance action immediately.</li> <li>
     *         <code>next-maintenance</code> - Apply the maintenance action during
     *         the next maintenance window for the resource.</li> <li>
     *         <code>undo-opt-in</code> - Cancel any existing
     *         <code>next-maintenance</code> opt-in requests.</li> </ul>
     */
    public String getOptInType() {
        return optInType;
    }
    
    /**
     * A value that specifies the type of opt-in request, or undoes an opt-in
     * request. An opt-in request of type <code>immediate</code> cannot be
     * undone. <p>Valid values: <ul> <li> <code>immediate</code> - Apply the
     * maintenance action immediately.</li> <li>
     * <code>next-maintenance</code> - Apply the maintenance action during
     * the next maintenance window for the resource.</li> <li>
     * <code>undo-opt-in</code> - Cancel any existing
     * <code>next-maintenance</code> opt-in requests.</li> </ul>
     *
     * @param optInType A value that specifies the type of opt-in request, or undoes an opt-in
     *         request. An opt-in request of type <code>immediate</code> cannot be
     *         undone. <p>Valid values: <ul> <li> <code>immediate</code> - Apply the
     *         maintenance action immediately.</li> <li>
     *         <code>next-maintenance</code> - Apply the maintenance action during
     *         the next maintenance window for the resource.</li> <li>
     *         <code>undo-opt-in</code> - Cancel any existing
     *         <code>next-maintenance</code> opt-in requests.</li> </ul>
     */
    public void setOptInType(String optInType) {
        this.optInType = optInType;
    }
    
    /**
     * A value that specifies the type of opt-in request, or undoes an opt-in
     * request. An opt-in request of type <code>immediate</code> cannot be
     * undone. <p>Valid values: <ul> <li> <code>immediate</code> - Apply the
     * maintenance action immediately.</li> <li>
     * <code>next-maintenance</code> - Apply the maintenance action during
     * the next maintenance window for the resource.</li> <li>
     * <code>undo-opt-in</code> - Cancel any existing
     * <code>next-maintenance</code> opt-in requests.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optInType A value that specifies the type of opt-in request, or undoes an opt-in
     *         request. An opt-in request of type <code>immediate</code> cannot be
     *         undone. <p>Valid values: <ul> <li> <code>immediate</code> - Apply the
     *         maintenance action immediately.</li> <li>
     *         <code>next-maintenance</code> - Apply the maintenance action during
     *         the next maintenance window for the resource.</li> <li>
     *         <code>undo-opt-in</code> - Cancel any existing
     *         <code>next-maintenance</code> opt-in requests.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ApplyPendingMaintenanceActionRequest withOptInType(String optInType) {
        this.optInType = optInType;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceIdentifier() != null) sb.append("ResourceIdentifier: " + getResourceIdentifier() + ",");
        if (getApplyAction() != null) sb.append("ApplyAction: " + getApplyAction() + ",");
        if (getOptInType() != null) sb.append("OptInType: " + getOptInType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getApplyAction() == null) ? 0 : getApplyAction().hashCode()); 
        hashCode = prime * hashCode + ((getOptInType() == null) ? 0 : getOptInType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ApplyPendingMaintenanceActionRequest == false) return false;
        ApplyPendingMaintenanceActionRequest other = (ApplyPendingMaintenanceActionRequest)obj;
        
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null) return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false) return false; 
        if (other.getApplyAction() == null ^ this.getApplyAction() == null) return false;
        if (other.getApplyAction() != null && other.getApplyAction().equals(this.getApplyAction()) == false) return false; 
        if (other.getOptInType() == null ^ this.getOptInType() == null) return false;
        if (other.getOptInType() != null && other.getOptInType().equals(this.getOptInType()) == false) return false; 
        return true;
    }
    
    @Override
    public ApplyPendingMaintenanceActionRequest clone() {
        
            return (ApplyPendingMaintenanceActionRequest) super.clone();
    }

}
    