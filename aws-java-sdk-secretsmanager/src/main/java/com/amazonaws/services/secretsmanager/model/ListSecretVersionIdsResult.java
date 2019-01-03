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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecretVersionIds"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecretVersionIdsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of the currently available versions of the specified secret.
     * </p>
     */
    private java.util.List<SecretVersionsListEntry> versions;
    /**
     * <p>
     * If present in the response, this value indicates that there's more output available than what's included in the
     * current response. This can occur even when the response includes no values at all, such as when you ask for a
     * filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent
     * call to the operation to continue processing and get the next part of the output. You should repeat this until
     * the <code>NextToken</code> response element comes back empty (as <code>null</code>).
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secret.
     * </p>
     * <note>
     * <p>
     * Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially
     * create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a
     * new secret with the same name as an old secret that you previously deleted, then users with access to the old
     * secret <i>don't</i> automatically get access to the new secret because the ARNs are different.
     * </p>
     * </note>
     */
    private String aRN;
    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The list of the currently available versions of the specified secret.
     * </p>
     * 
     * @return The list of the currently available versions of the specified secret.
     */

    public java.util.List<SecretVersionsListEntry> getVersions() {
        return versions;
    }

    /**
     * <p>
     * The list of the currently available versions of the specified secret.
     * </p>
     * 
     * @param versions
     *        The list of the currently available versions of the specified secret.
     */

    public void setVersions(java.util.Collection<SecretVersionsListEntry> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<SecretVersionsListEntry>(versions);
    }

    /**
     * <p>
     * The list of the currently available versions of the specified secret.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        The list of the currently available versions of the specified secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsResult withVersions(SecretVersionsListEntry... versions) {
        if (this.versions == null) {
            setVersions(new java.util.ArrayList<SecretVersionsListEntry>(versions.length));
        }
        for (SecretVersionsListEntry ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the currently available versions of the specified secret.
     * </p>
     * 
     * @param versions
     *        The list of the currently available versions of the specified secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsResult withVersions(java.util.Collection<SecretVersionsListEntry> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * If present in the response, this value indicates that there's more output available than what's included in the
     * current response. This can occur even when the response includes no values at all, such as when you ask for a
     * filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent
     * call to the operation to continue processing and get the next part of the output. You should repeat this until
     * the <code>NextToken</code> response element comes back empty (as <code>null</code>).
     * </p>
     * 
     * @param nextToken
     *        If present in the response, this value indicates that there's more output available than what's included
     *        in the current response. This can occur even when the response includes no values at all, such as when you
     *        ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request
     *        parameter in a subsequent call to the operation to continue processing and get the next part of the
     *        output. You should repeat this until the <code>NextToken</code> response element comes back empty (as
     *        <code>null</code>).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present in the response, this value indicates that there's more output available than what's included in the
     * current response. This can occur even when the response includes no values at all, such as when you ask for a
     * filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent
     * call to the operation to continue processing and get the next part of the output. You should repeat this until
     * the <code>NextToken</code> response element comes back empty (as <code>null</code>).
     * </p>
     * 
     * @return If present in the response, this value indicates that there's more output available than what's included
     *         in the current response. This can occur even when the response includes no values at all, such as when
     *         you ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request
     *         parameter in a subsequent call to the operation to continue processing and get the next part of the
     *         output. You should repeat this until the <code>NextToken</code> response element comes back empty (as
     *         <code>null</code>).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present in the response, this value indicates that there's more output available than what's included in the
     * current response. This can occur even when the response includes no values at all, such as when you ask for a
     * filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent
     * call to the operation to continue processing and get the next part of the output. You should repeat this until
     * the <code>NextToken</code> response element comes back empty (as <code>null</code>).
     * </p>
     * 
     * @param nextToken
     *        If present in the response, this value indicates that there's more output available than what's included
     *        in the current response. This can occur even when the response includes no values at all, such as when you
     *        ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request
     *        parameter in a subsequent call to the operation to continue processing and get the next part of the
     *        output. You should repeat this until the <code>NextToken</code> response element comes back empty (as
     *        <code>null</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secret.
     * </p>
     * <note>
     * <p>
     * Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially
     * create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a
     * new secret with the same name as an old secret that you previously deleted, then users with access to the old
     * secret <i>don't</i> automatically get access to the new secret because the ARNs are different.
     * </p>
     * </note>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) for the secret.</p> <note>
     *        <p>
     *        Secrets Manager automatically adds several random characters to the name at the end of the ARN when you
     *        initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that
     *        if you create a new secret with the same name as an old secret that you previously deleted, then users
     *        with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are
     *        different.
     *        </p>
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secret.
     * </p>
     * <note>
     * <p>
     * Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially
     * create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a
     * new secret with the same name as an old secret that you previously deleted, then users with access to the old
     * secret <i>don't</i> automatically get access to the new secret because the ARNs are different.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) for the secret.</p> <note>
     *         <p>
     *         Secrets Manager automatically adds several random characters to the name at the end of the ARN when you
     *         initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that
     *         if you create a new secret with the same name as an old secret that you previously deleted, then users
     *         with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs
     *         are different.
     *         </p>
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secret.
     * </p>
     * <note>
     * <p>
     * Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially
     * create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a
     * new secret with the same name as an old secret that you previously deleted, then users with access to the old
     * secret <i>don't</i> automatically get access to the new secret because the ARNs are different.
     * </p>
     * </note>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) for the secret.</p> <note>
     *        <p>
     *        Secrets Manager automatically adds several random characters to the name at the end of the ARN when you
     *        initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that
     *        if you create a new secret with the same name as an old secret that you previously deleted, then users
     *        with access to the old secret <i>don't</i> automatically get access to the new secret because the ARNs are
     *        different.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     * 
     * @return The friendly name of the secret.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the secret.
     * </p>
     * 
     * @param name
     *        The friendly name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsResult withName(String name) {
        setName(name);
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
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecretVersionIdsResult == false)
            return false;
        ListSecretVersionIdsResult other = (ListSecretVersionIdsResult) obj;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ListSecretVersionIdsResult clone() {
        try {
            return (ListSecretVersionIdsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
