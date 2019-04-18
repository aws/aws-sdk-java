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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOrganizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature set supports different levels of
     * functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master account.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master account
     * can also apply any type of policy to any member account in the organization. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String featureSet;

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature set supports different levels of
     * functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master account.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master account
     * can also apply any type of policy to any member account in the organization. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureSet
     *        Specifies the feature set supported by the new organization. Each feature set supports different levels of
     *        functionality.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master
     *        account. For more information, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     *        >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        <p>
     *        The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master
     *        account can also apply any type of policy to any member account in the organization. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     *        >All features</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        </li>
     * @see OrganizationFeatureSet
     */

    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature set supports different levels of
     * functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master account.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master account
     * can also apply any type of policy to any member account in the organization. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the feature set supported by the new organization. Each feature set supports different levels
     *         of functionality.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master
     *         account. For more information, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     *         >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     *         </p>
     *         <p>
     *         The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US)
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master
     *         account can also apply any type of policy to any member account in the organization. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     *         >All features</a> in the <i>AWS Organizations User Guide</i>.
     *         </p>
     *         </li>
     * @see OrganizationFeatureSet
     */

    public String getFeatureSet() {
        return this.featureSet;
    }

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature set supports different levels of
     * functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master account.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master account
     * can also apply any type of policy to any member account in the organization. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureSet
     *        Specifies the feature set supported by the new organization. Each feature set supports different levels of
     *        functionality.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master
     *        account. For more information, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     *        >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        <p>
     *        The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master
     *        account can also apply any type of policy to any member account in the organization. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     *        >All features</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationFeatureSet
     */

    public CreateOrganizationRequest withFeatureSet(String featureSet) {
        setFeatureSet(featureSet);
        return this;
    }

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature set supports different levels of
     * functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master account.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master account
     * can also apply any type of policy to any member account in the organization. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureSet
     *        Specifies the feature set supported by the new organization. Each feature set supports different levels of
     *        functionality.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master
     *        account. For more information, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     *        >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        <p>
     *        The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master
     *        account can also apply any type of policy to any member account in the organization. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     *        >All features</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        </li>
     * @see OrganizationFeatureSet
     */

    public void setFeatureSet(OrganizationFeatureSet featureSet) {
        withFeatureSet(featureSet);
    }

    /**
     * <p>
     * Specifies the feature set supported by the new organization. Each feature set supports different levels of
     * functionality.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master account.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     * >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master account
     * can also apply any type of policy to any member account in the organization. For more information, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     * >All features</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureSet
     *        Specifies the feature set supported by the new organization. Each feature set supports different levels of
     *        functionality.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>CONSOLIDATED_BILLING</i>: All member accounts have their bills consolidated to and paid by the master
     *        account. For more information, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only"
     *        >Consolidated billing</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        <p>
     *        The consolidated billing feature subset isn't available for organizations in the AWS GovCloud (US) Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ALL</i>: In addition to all the features supported by the consolidated billing feature set, the master
     *        account can also apply any type of policy to any member account in the organization. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all"
     *        >All features</a> in the <i>AWS Organizations User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationFeatureSet
     */

    public CreateOrganizationRequest withFeatureSet(OrganizationFeatureSet featureSet) {
        this.featureSet = featureSet.toString();
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
        if (getFeatureSet() != null)
            sb.append("FeatureSet: ").append(getFeatureSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOrganizationRequest == false)
            return false;
        CreateOrganizationRequest other = (CreateOrganizationRequest) obj;
        if (other.getFeatureSet() == null ^ this.getFeatureSet() == null)
            return false;
        if (other.getFeatureSet() != null && other.getFeatureSet().equals(this.getFeatureSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureSet() == null) ? 0 : getFeatureSet().hashCode());
        return hashCode;
    }

    @Override
    public CreateOrganizationRequest clone() {
        return (CreateOrganizationRequest) super.clone();
    }

}
