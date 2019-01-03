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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/MoveAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MoveAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the account that you want to move.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you want to move the account from.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceParentId;
    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you want to move the account to.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     */
    private String destinationParentId;

    /**
     * <p>
     * The unique identifier (ID) of the account that you want to move.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @param accountId
     *        The unique identifier (ID) of the account that you want to move.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *        12 digits.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the account that you want to move.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the account that you want to move.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *         12 digits.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the account that you want to move.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @param accountId
     *        The unique identifier (ID) of the account that you want to move.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *        12 digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MoveAccountRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you want to move the account from.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceParentId
     *        The unique identifier (ID) of the root or organizational unit that you want to move the account from.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     */

    public void setSourceParentId(String sourceParentId) {
        this.sourceParentId = sourceParentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you want to move the account from.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier (ID) of the root or organizational unit that you want to move the account from.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *         digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *         lower-case letters or digits.
     *         </p>
     *         </li>
     */

    public String getSourceParentId() {
        return this.sourceParentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you want to move the account from.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceParentId
     *        The unique identifier (ID) of the root or organizational unit that you want to move the account from.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MoveAccountRequest withSourceParentId(String sourceParentId) {
        setSourceParentId(sourceParentId);
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you want to move the account to.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationParentId
     *        The unique identifier (ID) of the root or organizational unit that you want to move the account to.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     */

    public void setDestinationParentId(String destinationParentId) {
        this.destinationParentId = destinationParentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you want to move the account to.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier (ID) of the root or organizational unit that you want to move the account to.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *         digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *         lower-case letters or digits.
     *         </p>
     *         </li>
     */

    public String getDestinationParentId() {
        return this.destinationParentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root or organizational unit that you want to move the account to.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationParentId
     *        The unique identifier (ID) of the root or organizational unit that you want to move the account to.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MoveAccountRequest withDestinationParentId(String destinationParentId) {
        setDestinationParentId(destinationParentId);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getSourceParentId() != null)
            sb.append("SourceParentId: ").append(getSourceParentId()).append(",");
        if (getDestinationParentId() != null)
            sb.append("DestinationParentId: ").append(getDestinationParentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MoveAccountRequest == false)
            return false;
        MoveAccountRequest other = (MoveAccountRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getSourceParentId() == null ^ this.getSourceParentId() == null)
            return false;
        if (other.getSourceParentId() != null && other.getSourceParentId().equals(this.getSourceParentId()) == false)
            return false;
        if (other.getDestinationParentId() == null ^ this.getDestinationParentId() == null)
            return false;
        if (other.getDestinationParentId() != null && other.getDestinationParentId().equals(this.getDestinationParentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getSourceParentId() == null) ? 0 : getSourceParentId().hashCode());
        hashCode = prime * hashCode + ((getDestinationParentId() == null) ? 0 : getDestinationParentId().hashCode());
        return hashCode;
    }

    @Override
    public MoveAccountRequest clone() {
        return (MoveAccountRequest) super.clone();
    }

}
