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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroupState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePatchGroupStateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of instances in the patch group.
     * </p>
     */
    private Integer instances;
    /**
     * <p>
     * The number of instances with installed patches.
     * </p>
     */
    private Integer instancesWithInstalledPatches;
    /**
     * <p>
     * The number of instances with patches installed that aren't defined in the patch baseline.
     * </p>
     */
    private Integer instancesWithInstalledOtherPatches;
    /**
     * <p>
     * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a
     * status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.
     * </p>
     * <note>
     * <p>
     * If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of
     * InstancesWithInstalledRejectedPatches will always be 0 (zero).
     * </p>
     * </note>
     */
    private Integer instancesWithInstalledRejectedPatches;
    /**
     * <p>
     * The number of instances with missing patches from the patch baseline.
     * </p>
     */
    private Integer instancesWithMissingPatches;
    /**
     * <p>
     * The number of instances with patches from the patch baseline that failed to install.
     * </p>
     */
    private Integer instancesWithFailedPatches;
    /**
     * <p>
     * The number of instances with patches that aren't applicable.
     * </p>
     */
    private Integer instancesWithNotApplicablePatches;

    /**
     * <p>
     * The number of instances in the patch group.
     * </p>
     * 
     * @param instances
     *        The number of instances in the patch group.
     */

    public void setInstances(Integer instances) {
        this.instances = instances;
    }

    /**
     * <p>
     * The number of instances in the patch group.
     * </p>
     * 
     * @return The number of instances in the patch group.
     */

    public Integer getInstances() {
        return this.instances;
    }

    /**
     * <p>
     * The number of instances in the patch group.
     * </p>
     * 
     * @param instances
     *        The number of instances in the patch group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstances(Integer instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The number of instances with installed patches.
     * </p>
     * 
     * @param instancesWithInstalledPatches
     *        The number of instances with installed patches.
     */

    public void setInstancesWithInstalledPatches(Integer instancesWithInstalledPatches) {
        this.instancesWithInstalledPatches = instancesWithInstalledPatches;
    }

    /**
     * <p>
     * The number of instances with installed patches.
     * </p>
     * 
     * @return The number of instances with installed patches.
     */

    public Integer getInstancesWithInstalledPatches() {
        return this.instancesWithInstalledPatches;
    }

    /**
     * <p>
     * The number of instances with installed patches.
     * </p>
     * 
     * @param instancesWithInstalledPatches
     *        The number of instances with installed patches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithInstalledPatches(Integer instancesWithInstalledPatches) {
        setInstancesWithInstalledPatches(instancesWithInstalledPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches installed that aren't defined in the patch baseline.
     * </p>
     * 
     * @param instancesWithInstalledOtherPatches
     *        The number of instances with patches installed that aren't defined in the patch baseline.
     */

    public void setInstancesWithInstalledOtherPatches(Integer instancesWithInstalledOtherPatches) {
        this.instancesWithInstalledOtherPatches = instancesWithInstalledOtherPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed that aren't defined in the patch baseline.
     * </p>
     * 
     * @return The number of instances with patches installed that aren't defined in the patch baseline.
     */

    public Integer getInstancesWithInstalledOtherPatches() {
        return this.instancesWithInstalledOtherPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed that aren't defined in the patch baseline.
     * </p>
     * 
     * @param instancesWithInstalledOtherPatches
     *        The number of instances with patches installed that aren't defined in the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithInstalledOtherPatches(Integer instancesWithInstalledOtherPatches) {
        setInstancesWithInstalledOtherPatches(instancesWithInstalledOtherPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a
     * status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.
     * </p>
     * <note>
     * <p>
     * If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of
     * InstancesWithInstalledRejectedPatches will always be 0 (zero).
     * </p>
     * </note>
     * 
     * @param instancesWithInstalledRejectedPatches
     *        The number of instances with patches installed that are specified in a RejectedPatches list. Patches with
     *        a status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches
     *        list.</p> <note>
     *        <p>
     *        If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of
     *        InstancesWithInstalledRejectedPatches will always be 0 (zero).
     *        </p>
     */

    public void setInstancesWithInstalledRejectedPatches(Integer instancesWithInstalledRejectedPatches) {
        this.instancesWithInstalledRejectedPatches = instancesWithInstalledRejectedPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a
     * status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.
     * </p>
     * <note>
     * <p>
     * If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of
     * InstancesWithInstalledRejectedPatches will always be 0 (zero).
     * </p>
     * </note>
     * 
     * @return The number of instances with patches installed that are specified in a RejectedPatches list. Patches with
     *         a status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a
     *         RejectedPatches list.</p> <note>
     *         <p>
     *         If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of
     *         InstancesWithInstalledRejectedPatches will always be 0 (zero).
     *         </p>
     */

    public Integer getInstancesWithInstalledRejectedPatches() {
        return this.instancesWithInstalledRejectedPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a
     * status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches list.
     * </p>
     * <note>
     * <p>
     * If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of
     * InstancesWithInstalledRejectedPatches will always be 0 (zero).
     * </p>
     * </note>
     * 
     * @param instancesWithInstalledRejectedPatches
     *        The number of instances with patches installed that are specified in a RejectedPatches list. Patches with
     *        a status of <i>INSTALLED_REJECTED</i> were typically installed before they were added to a RejectedPatches
     *        list.</p> <note>
     *        <p>
     *        If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of
     *        InstancesWithInstalledRejectedPatches will always be 0 (zero).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithInstalledRejectedPatches(Integer instancesWithInstalledRejectedPatches) {
        setInstancesWithInstalledRejectedPatches(instancesWithInstalledRejectedPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with missing patches from the patch baseline.
     * </p>
     * 
     * @param instancesWithMissingPatches
     *        The number of instances with missing patches from the patch baseline.
     */

    public void setInstancesWithMissingPatches(Integer instancesWithMissingPatches) {
        this.instancesWithMissingPatches = instancesWithMissingPatches;
    }

    /**
     * <p>
     * The number of instances with missing patches from the patch baseline.
     * </p>
     * 
     * @return The number of instances with missing patches from the patch baseline.
     */

    public Integer getInstancesWithMissingPatches() {
        return this.instancesWithMissingPatches;
    }

    /**
     * <p>
     * The number of instances with missing patches from the patch baseline.
     * </p>
     * 
     * @param instancesWithMissingPatches
     *        The number of instances with missing patches from the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithMissingPatches(Integer instancesWithMissingPatches) {
        setInstancesWithMissingPatches(instancesWithMissingPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches from the patch baseline that failed to install.
     * </p>
     * 
     * @param instancesWithFailedPatches
     *        The number of instances with patches from the patch baseline that failed to install.
     */

    public void setInstancesWithFailedPatches(Integer instancesWithFailedPatches) {
        this.instancesWithFailedPatches = instancesWithFailedPatches;
    }

    /**
     * <p>
     * The number of instances with patches from the patch baseline that failed to install.
     * </p>
     * 
     * @return The number of instances with patches from the patch baseline that failed to install.
     */

    public Integer getInstancesWithFailedPatches() {
        return this.instancesWithFailedPatches;
    }

    /**
     * <p>
     * The number of instances with patches from the patch baseline that failed to install.
     * </p>
     * 
     * @param instancesWithFailedPatches
     *        The number of instances with patches from the patch baseline that failed to install.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithFailedPatches(Integer instancesWithFailedPatches) {
        setInstancesWithFailedPatches(instancesWithFailedPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches that aren't applicable.
     * </p>
     * 
     * @param instancesWithNotApplicablePatches
     *        The number of instances with patches that aren't applicable.
     */

    public void setInstancesWithNotApplicablePatches(Integer instancesWithNotApplicablePatches) {
        this.instancesWithNotApplicablePatches = instancesWithNotApplicablePatches;
    }

    /**
     * <p>
     * The number of instances with patches that aren't applicable.
     * </p>
     * 
     * @return The number of instances with patches that aren't applicable.
     */

    public Integer getInstancesWithNotApplicablePatches() {
        return this.instancesWithNotApplicablePatches;
    }

    /**
     * <p>
     * The number of instances with patches that aren't applicable.
     * </p>
     * 
     * @param instancesWithNotApplicablePatches
     *        The number of instances with patches that aren't applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithNotApplicablePatches(Integer instancesWithNotApplicablePatches) {
        setInstancesWithNotApplicablePatches(instancesWithNotApplicablePatches);
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
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getInstancesWithInstalledPatches() != null)
            sb.append("InstancesWithInstalledPatches: ").append(getInstancesWithInstalledPatches()).append(",");
        if (getInstancesWithInstalledOtherPatches() != null)
            sb.append("InstancesWithInstalledOtherPatches: ").append(getInstancesWithInstalledOtherPatches()).append(",");
        if (getInstancesWithInstalledRejectedPatches() != null)
            sb.append("InstancesWithInstalledRejectedPatches: ").append(getInstancesWithInstalledRejectedPatches()).append(",");
        if (getInstancesWithMissingPatches() != null)
            sb.append("InstancesWithMissingPatches: ").append(getInstancesWithMissingPatches()).append(",");
        if (getInstancesWithFailedPatches() != null)
            sb.append("InstancesWithFailedPatches: ").append(getInstancesWithFailedPatches()).append(",");
        if (getInstancesWithNotApplicablePatches() != null)
            sb.append("InstancesWithNotApplicablePatches: ").append(getInstancesWithNotApplicablePatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePatchGroupStateResult == false)
            return false;
        DescribePatchGroupStateResult other = (DescribePatchGroupStateResult) obj;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getInstancesWithInstalledPatches() == null ^ this.getInstancesWithInstalledPatches() == null)
            return false;
        if (other.getInstancesWithInstalledPatches() != null
                && other.getInstancesWithInstalledPatches().equals(this.getInstancesWithInstalledPatches()) == false)
            return false;
        if (other.getInstancesWithInstalledOtherPatches() == null ^ this.getInstancesWithInstalledOtherPatches() == null)
            return false;
        if (other.getInstancesWithInstalledOtherPatches() != null
                && other.getInstancesWithInstalledOtherPatches().equals(this.getInstancesWithInstalledOtherPatches()) == false)
            return false;
        if (other.getInstancesWithInstalledRejectedPatches() == null ^ this.getInstancesWithInstalledRejectedPatches() == null)
            return false;
        if (other.getInstancesWithInstalledRejectedPatches() != null
                && other.getInstancesWithInstalledRejectedPatches().equals(this.getInstancesWithInstalledRejectedPatches()) == false)
            return false;
        if (other.getInstancesWithMissingPatches() == null ^ this.getInstancesWithMissingPatches() == null)
            return false;
        if (other.getInstancesWithMissingPatches() != null && other.getInstancesWithMissingPatches().equals(this.getInstancesWithMissingPatches()) == false)
            return false;
        if (other.getInstancesWithFailedPatches() == null ^ this.getInstancesWithFailedPatches() == null)
            return false;
        if (other.getInstancesWithFailedPatches() != null && other.getInstancesWithFailedPatches().equals(this.getInstancesWithFailedPatches()) == false)
            return false;
        if (other.getInstancesWithNotApplicablePatches() == null ^ this.getInstancesWithNotApplicablePatches() == null)
            return false;
        if (other.getInstancesWithNotApplicablePatches() != null
                && other.getInstancesWithNotApplicablePatches().equals(this.getInstancesWithNotApplicablePatches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithInstalledPatches() == null) ? 0 : getInstancesWithInstalledPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithInstalledOtherPatches() == null) ? 0 : getInstancesWithInstalledOtherPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithInstalledRejectedPatches() == null) ? 0 : getInstancesWithInstalledRejectedPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithMissingPatches() == null) ? 0 : getInstancesWithMissingPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithFailedPatches() == null) ? 0 : getInstancesWithFailedPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithNotApplicablePatches() == null) ? 0 : getInstancesWithNotApplicablePatches().hashCode());
        return hashCode;
    }

    @Override
    public DescribePatchGroupStateResult clone() {
        try {
            return (DescribePatchGroupStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
