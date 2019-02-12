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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a webhook that connects repository events to a build project in AWS CodeBuild.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/Webhook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Webhook implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The AWS CodeBuild endpoint where webhook events are sent.
     * </p>
     */
    private String payloadUrl;
    /**
     * <p>
     * The secret token of the associated repository.
     * </p>
     * <note>
     * <p>
     * A Bitbucket webhook does not support <code>secret</code>.
     * </p>
     * </note>
     */
    private String secret;
    /**
     * <p>
     * A regular expression used to determine which repository branches are built when a webhook is triggered. If the
     * name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is empty, then
     * all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     * </p>
     * </note>
     */
    private String branchFilter;
    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to determine which webhooks are triggered. At least
     * one <code>WebhookFilter</code> in the array must specify <code>EVENT</code> as its <code>type</code>.
     * </p>
     * <p>
     * For a build to be triggered, at least one filter group in the <code>filterGroups</code> array must pass. For a
     * filter group to pass, each of its filters must pass.
     * </p>
     */
    private java.util.List<java.util.List<WebhookFilter>> filterGroups;
    /**
     * <p>
     * A timestamp that indicates the last time a repository's secret token was modified.
     * </p>
     */
    private java.util.Date lastModifiedSecret;

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     * 
     * @param url
     *        The URL to the webhook.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     * 
     * @return The URL to the webhook.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     * 
     * @param url
     *        The URL to the webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The AWS CodeBuild endpoint where webhook events are sent.
     * </p>
     * 
     * @param payloadUrl
     *        The AWS CodeBuild endpoint where webhook events are sent.
     */

    public void setPayloadUrl(String payloadUrl) {
        this.payloadUrl = payloadUrl;
    }

    /**
     * <p>
     * The AWS CodeBuild endpoint where webhook events are sent.
     * </p>
     * 
     * @return The AWS CodeBuild endpoint where webhook events are sent.
     */

    public String getPayloadUrl() {
        return this.payloadUrl;
    }

    /**
     * <p>
     * The AWS CodeBuild endpoint where webhook events are sent.
     * </p>
     * 
     * @param payloadUrl
     *        The AWS CodeBuild endpoint where webhook events are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withPayloadUrl(String payloadUrl) {
        setPayloadUrl(payloadUrl);
        return this;
    }

    /**
     * <p>
     * The secret token of the associated repository.
     * </p>
     * <note>
     * <p>
     * A Bitbucket webhook does not support <code>secret</code>.
     * </p>
     * </note>
     * 
     * @param secret
     *        The secret token of the associated repository. </p> <note>
     *        <p>
     *        A Bitbucket webhook does not support <code>secret</code>.
     *        </p>
     */

    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * <p>
     * The secret token of the associated repository.
     * </p>
     * <note>
     * <p>
     * A Bitbucket webhook does not support <code>secret</code>.
     * </p>
     * </note>
     * 
     * @return The secret token of the associated repository. </p> <note>
     *         <p>
     *         A Bitbucket webhook does not support <code>secret</code>.
     *         </p>
     */

    public String getSecret() {
        return this.secret;
    }

    /**
     * <p>
     * The secret token of the associated repository.
     * </p>
     * <note>
     * <p>
     * A Bitbucket webhook does not support <code>secret</code>.
     * </p>
     * </note>
     * 
     * @param secret
     *        The secret token of the associated repository. </p> <note>
     *        <p>
     *        A Bitbucket webhook does not support <code>secret</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withSecret(String secret) {
        setSecret(secret);
        return this;
    }

    /**
     * <p>
     * A regular expression used to determine which repository branches are built when a webhook is triggered. If the
     * name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is empty, then
     * all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     * </p>
     * </note>
     * 
     * @param branchFilter
     *        A regular expression used to determine which repository branches are built when a webhook is triggered. If
     *        the name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is
     *        empty, then all branches are built.</p> <note>
     *        <p>
     *        It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     *        </p>
     */

    public void setBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
    }

    /**
     * <p>
     * A regular expression used to determine which repository branches are built when a webhook is triggered. If the
     * name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is empty, then
     * all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     * </p>
     * </note>
     * 
     * @return A regular expression used to determine which repository branches are built when a webhook is triggered.
     *         If the name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is
     *         empty, then all branches are built.</p> <note>
     *         <p>
     *         It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     *         </p>
     */

    public String getBranchFilter() {
        return this.branchFilter;
    }

    /**
     * <p>
     * A regular expression used to determine which repository branches are built when a webhook is triggered. If the
     * name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is empty, then
     * all branches are built.
     * </p>
     * <note>
     * <p>
     * It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     * </p>
     * </note>
     * 
     * @param branchFilter
     *        A regular expression used to determine which repository branches are built when a webhook is triggered. If
     *        the name of a branch matches the regular expression, then it is built. If <code>branchFilter</code> is
     *        empty, then all branches are built.</p> <note>
     *        <p>
     *        It is recommended that you use <code>filterGroups</code> instead of <code>branchFilter</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withBranchFilter(String branchFilter) {
        setBranchFilter(branchFilter);
        return this;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to determine which webhooks are triggered. At least
     * one <code>WebhookFilter</code> in the array must specify <code>EVENT</code> as its <code>type</code>.
     * </p>
     * <p>
     * For a build to be triggered, at least one filter group in the <code>filterGroups</code> array must pass. For a
     * filter group to pass, each of its filters must pass.
     * </p>
     * 
     * @return An array of arrays of <code>WebhookFilter</code> objects used to determine which webhooks are triggered.
     *         At least one <code>WebhookFilter</code> in the array must specify <code>EVENT</code> as its
     *         <code>type</code>. </p>
     *         <p>
     *         For a build to be triggered, at least one filter group in the <code>filterGroups</code> array must pass.
     *         For a filter group to pass, each of its filters must pass.
     */

    public java.util.List<java.util.List<WebhookFilter>> getFilterGroups() {
        return filterGroups;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to determine which webhooks are triggered. At least
     * one <code>WebhookFilter</code> in the array must specify <code>EVENT</code> as its <code>type</code>.
     * </p>
     * <p>
     * For a build to be triggered, at least one filter group in the <code>filterGroups</code> array must pass. For a
     * filter group to pass, each of its filters must pass.
     * </p>
     * 
     * @param filterGroups
     *        An array of arrays of <code>WebhookFilter</code> objects used to determine which webhooks are triggered.
     *        At least one <code>WebhookFilter</code> in the array must specify <code>EVENT</code> as its
     *        <code>type</code>. </p>
     *        <p>
     *        For a build to be triggered, at least one filter group in the <code>filterGroups</code> array must pass.
     *        For a filter group to pass, each of its filters must pass.
     */

    public void setFilterGroups(java.util.Collection<java.util.List<WebhookFilter>> filterGroups) {
        if (filterGroups == null) {
            this.filterGroups = null;
            return;
        }

        this.filterGroups = new java.util.ArrayList<java.util.List<WebhookFilter>>(filterGroups);
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to determine which webhooks are triggered. At least
     * one <code>WebhookFilter</code> in the array must specify <code>EVENT</code> as its <code>type</code>.
     * </p>
     * <p>
     * For a build to be triggered, at least one filter group in the <code>filterGroups</code> array must pass. For a
     * filter group to pass, each of its filters must pass.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterGroups(java.util.Collection)} or {@link #withFilterGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterGroups
     *        An array of arrays of <code>WebhookFilter</code> objects used to determine which webhooks are triggered.
     *        At least one <code>WebhookFilter</code> in the array must specify <code>EVENT</code> as its
     *        <code>type</code>. </p>
     *        <p>
     *        For a build to be triggered, at least one filter group in the <code>filterGroups</code> array must pass.
     *        For a filter group to pass, each of its filters must pass.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withFilterGroups(java.util.List<WebhookFilter>... filterGroups) {
        if (this.filterGroups == null) {
            setFilterGroups(new java.util.ArrayList<java.util.List<WebhookFilter>>(filterGroups.length));
        }
        for (java.util.List<WebhookFilter> ele : filterGroups) {
            this.filterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of arrays of <code>WebhookFilter</code> objects used to determine which webhooks are triggered. At least
     * one <code>WebhookFilter</code> in the array must specify <code>EVENT</code> as its <code>type</code>.
     * </p>
     * <p>
     * For a build to be triggered, at least one filter group in the <code>filterGroups</code> array must pass. For a
     * filter group to pass, each of its filters must pass.
     * </p>
     * 
     * @param filterGroups
     *        An array of arrays of <code>WebhookFilter</code> objects used to determine which webhooks are triggered.
     *        At least one <code>WebhookFilter</code> in the array must specify <code>EVENT</code> as its
     *        <code>type</code>. </p>
     *        <p>
     *        For a build to be triggered, at least one filter group in the <code>filterGroups</code> array must pass.
     *        For a filter group to pass, each of its filters must pass.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withFilterGroups(java.util.Collection<java.util.List<WebhookFilter>> filterGroups) {
        setFilterGroups(filterGroups);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates the last time a repository's secret token was modified.
     * </p>
     * 
     * @param lastModifiedSecret
     *        A timestamp that indicates the last time a repository's secret token was modified.
     */

    public void setLastModifiedSecret(java.util.Date lastModifiedSecret) {
        this.lastModifiedSecret = lastModifiedSecret;
    }

    /**
     * <p>
     * A timestamp that indicates the last time a repository's secret token was modified.
     * </p>
     * 
     * @return A timestamp that indicates the last time a repository's secret token was modified.
     */

    public java.util.Date getLastModifiedSecret() {
        return this.lastModifiedSecret;
    }

    /**
     * <p>
     * A timestamp that indicates the last time a repository's secret token was modified.
     * </p>
     * 
     * @param lastModifiedSecret
     *        A timestamp that indicates the last time a repository's secret token was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withLastModifiedSecret(java.util.Date lastModifiedSecret) {
        setLastModifiedSecret(lastModifiedSecret);
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getPayloadUrl() != null)
            sb.append("PayloadUrl: ").append(getPayloadUrl()).append(",");
        if (getSecret() != null)
            sb.append("Secret: ").append(getSecret()).append(",");
        if (getBranchFilter() != null)
            sb.append("BranchFilter: ").append(getBranchFilter()).append(",");
        if (getFilterGroups() != null)
            sb.append("FilterGroups: ").append(getFilterGroups()).append(",");
        if (getLastModifiedSecret() != null)
            sb.append("LastModifiedSecret: ").append(getLastModifiedSecret());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Webhook == false)
            return false;
        Webhook other = (Webhook) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getPayloadUrl() == null ^ this.getPayloadUrl() == null)
            return false;
        if (other.getPayloadUrl() != null && other.getPayloadUrl().equals(this.getPayloadUrl()) == false)
            return false;
        if (other.getSecret() == null ^ this.getSecret() == null)
            return false;
        if (other.getSecret() != null && other.getSecret().equals(this.getSecret()) == false)
            return false;
        if (other.getBranchFilter() == null ^ this.getBranchFilter() == null)
            return false;
        if (other.getBranchFilter() != null && other.getBranchFilter().equals(this.getBranchFilter()) == false)
            return false;
        if (other.getFilterGroups() == null ^ this.getFilterGroups() == null)
            return false;
        if (other.getFilterGroups() != null && other.getFilterGroups().equals(this.getFilterGroups()) == false)
            return false;
        if (other.getLastModifiedSecret() == null ^ this.getLastModifiedSecret() == null)
            return false;
        if (other.getLastModifiedSecret() != null && other.getLastModifiedSecret().equals(this.getLastModifiedSecret()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getPayloadUrl() == null) ? 0 : getPayloadUrl().hashCode());
        hashCode = prime * hashCode + ((getSecret() == null) ? 0 : getSecret().hashCode());
        hashCode = prime * hashCode + ((getBranchFilter() == null) ? 0 : getBranchFilter().hashCode());
        hashCode = prime * hashCode + ((getFilterGroups() == null) ? 0 : getFilterGroups().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedSecret() == null) ? 0 : getLastModifiedSecret().hashCode());
        return hashCode;
    }

    @Override
    public Webhook clone() {
        try {
            return (Webhook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.WebhookMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
