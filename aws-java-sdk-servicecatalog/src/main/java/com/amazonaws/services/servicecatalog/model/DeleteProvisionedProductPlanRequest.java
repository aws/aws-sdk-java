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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DeleteProvisionedProductPlan"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProvisionedProductPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;
    /**
     * <p>
     * The plan identifier.
     * </p>
     */
    private String planId;
    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the
     * underlying resources.
     * </p>
     */
    private Boolean ignoreErrors;

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProvisionedProductPlanRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * 
     * @param planId
     *        The plan identifier.
     */

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * 
     * @return The plan identifier.
     */

    public String getPlanId() {
        return this.planId;
    }

    /**
     * <p>
     * The plan identifier.
     * </p>
     * 
     * @param planId
     *        The plan identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProvisionedProductPlanRequest withPlanId(String planId) {
        setPlanId(planId);
        return this;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the
     * underlying resources.
     * </p>
     * 
     * @param ignoreErrors
     *        If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot
     *        delete the underlying resources.
     */

    public void setIgnoreErrors(Boolean ignoreErrors) {
        this.ignoreErrors = ignoreErrors;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the
     * underlying resources.
     * </p>
     * 
     * @return If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot
     *         delete the underlying resources.
     */

    public Boolean getIgnoreErrors() {
        return this.ignoreErrors;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the
     * underlying resources.
     * </p>
     * 
     * @param ignoreErrors
     *        If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot
     *        delete the underlying resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProvisionedProductPlanRequest withIgnoreErrors(Boolean ignoreErrors) {
        setIgnoreErrors(ignoreErrors);
        return this;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the
     * underlying resources.
     * </p>
     * 
     * @return If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot
     *         delete the underlying resources.
     */

    public Boolean isIgnoreErrors() {
        return this.ignoreErrors;
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getPlanId() != null)
            sb.append("PlanId: ").append(getPlanId()).append(",");
        if (getIgnoreErrors() != null)
            sb.append("IgnoreErrors: ").append(getIgnoreErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProvisionedProductPlanRequest == false)
            return false;
        DeleteProvisionedProductPlanRequest other = (DeleteProvisionedProductPlanRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPlanId() == null ^ this.getPlanId() == null)
            return false;
        if (other.getPlanId() != null && other.getPlanId().equals(this.getPlanId()) == false)
            return false;
        if (other.getIgnoreErrors() == null ^ this.getIgnoreErrors() == null)
            return false;
        if (other.getIgnoreErrors() != null && other.getIgnoreErrors().equals(this.getIgnoreErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        hashCode = prime * hashCode + ((getIgnoreErrors() == null) ? 0 : getIgnoreErrors().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProvisionedProductPlanRequest clone() {
        return (DeleteProvisionedProductPlanRequest) super.clone();
    }

}
