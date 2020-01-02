/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/CreateHomeRegionControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHomeRegionControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the home region of the calling account.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * The account for which this command sets up a home region control. The <code>Target</code> is always of type
     * <code>ACCOUNT</code>.
     * </p>
     */
    private Target target;
    /**
     * <p>
     * Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has
     * permission to make the call.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the home region of the calling account.
     * </p>
     * 
     * @param homeRegion
     *        The name of the home region of the calling account.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * The name of the home region of the calling account.
     * </p>
     * 
     * @return The name of the home region of the calling account.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * The name of the home region of the calling account.
     * </p>
     * 
     * @param homeRegion
     *        The name of the home region of the calling account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHomeRegionControlRequest withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * The account for which this command sets up a home region control. The <code>Target</code> is always of type
     * <code>ACCOUNT</code>.
     * </p>
     * 
     * @param target
     *        The account for which this command sets up a home region control. The <code>Target</code> is always of
     *        type <code>ACCOUNT</code>.
     */

    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * <p>
     * The account for which this command sets up a home region control. The <code>Target</code> is always of type
     * <code>ACCOUNT</code>.
     * </p>
     * 
     * @return The account for which this command sets up a home region control. The <code>Target</code> is always of
     *         type <code>ACCOUNT</code>.
     */

    public Target getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The account for which this command sets up a home region control. The <code>Target</code> is always of type
     * <code>ACCOUNT</code>.
     * </p>
     * 
     * @param target
     *        The account for which this command sets up a home region control. The <code>Target</code> is always of
     *        type <code>ACCOUNT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHomeRegionControlRequest withTarget(Target target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has
     * permission to make the call.
     * </p>
     * 
     * @param dryRun
     *        Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has
     *        permission to make the call.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has
     * permission to make the call.
     * </p>
     * 
     * @return Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has
     *         permission to make the call.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has
     * permission to make the call.
     * </p>
     * 
     * @param dryRun
     *        Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has
     *        permission to make the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHomeRegionControlRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has
     * permission to make the call.
     * </p>
     * 
     * @return Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has
     *         permission to make the call.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHomeRegionControlRequest == false)
            return false;
        CreateHomeRegionControlRequest other = (CreateHomeRegionControlRequest) obj;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public CreateHomeRegionControlRequest clone() {
        return (CreateHomeRegionControlRequest) super.clone();
    }

}
