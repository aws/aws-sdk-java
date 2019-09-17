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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to list users.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool on which the search should be performed.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * An array of strings, where each string is the name of a user attribute to be returned for each user in the search
     * results. If the array is null, all attributes are returned.
     * </p>
     */
    private java.util.List<String> attributesToGet;
    /**
     * <p>
     * Maximum number of users to be returned.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String paginationToken;
    /**
     * <p>
     * A filter string of the form "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"". Quotation marks
     * within the filter string must be escaped using the backslash (\) character. For example, "
     * <code>family_name</code> = \"Reddy\"".
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i>: The name of the attribute to search for. You can only search for one attribute at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Filter-Type</i>: For an exact match, use =, for example, "<code>given_name</code> = \"Jon\"". For a prefix
     * ("starts with") match, use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AttributeValue</i>: The attribute value that must be matched for each user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the filter string is empty, <code>ListUsers</code> returns all users in the user pool.
     * </p>
     * <p>
     * You can only search for the following standard attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>username</code> (case-sensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>phone_number</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>given_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>family_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>preferred_username</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cognito:user_status</code> (called <b>Status</b> in the Console) (case-insensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sub</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Custom attributes are not searchable.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     * >Searching for Users Using the ListUsers API</a> and <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     * >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     */
    private String filter;

    /**
     * <p>
     * The user pool ID for the user pool on which the search should be performed.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool on which the search should be performed.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool on which the search should be performed.
     * </p>
     * 
     * @return The user pool ID for the user pool on which the search should be performed.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool on which the search should be performed.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool on which the search should be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * An array of strings, where each string is the name of a user attribute to be returned for each user in the search
     * results. If the array is null, all attributes are returned.
     * </p>
     * 
     * @return An array of strings, where each string is the name of a user attribute to be returned for each user in
     *         the search results. If the array is null, all attributes are returned.
     */

    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <p>
     * An array of strings, where each string is the name of a user attribute to be returned for each user in the search
     * results. If the array is null, all attributes are returned.
     * </p>
     * 
     * @param attributesToGet
     *        An array of strings, where each string is the name of a user attribute to be returned for each user in the
     *        search results. If the array is null, all attributes are returned.
     */

    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        this.attributesToGet = new java.util.ArrayList<String>(attributesToGet);
    }

    /**
     * <p>
     * An array of strings, where each string is the name of a user attribute to be returned for each user in the search
     * results. If the array is null, all attributes are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesToGet(java.util.Collection)} or {@link #withAttributesToGet(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributesToGet
     *        An array of strings, where each string is the name of a user attribute to be returned for each user in the
     *        search results. If the array is null, all attributes are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withAttributesToGet(String... attributesToGet) {
        if (this.attributesToGet == null) {
            setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        }
        for (String ele : attributesToGet) {
            this.attributesToGet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings, where each string is the name of a user attribute to be returned for each user in the search
     * results. If the array is null, all attributes are returned.
     * </p>
     * 
     * @param attributesToGet
     *        An array of strings, where each string is the name of a user attribute to be returned for each user in the
     *        search results. If the array is null, all attributes are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * Maximum number of users to be returned.
     * </p>
     * 
     * @param limit
     *        Maximum number of users to be returned.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of users to be returned.
     * </p>
     * 
     * @return Maximum number of users to be returned.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of users to be returned.
     * </p>
     * 
     * @param limit
     *        Maximum number of users to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param paginationToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param paginationToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
        return this;
    }

    /**
     * <p>
     * A filter string of the form "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"". Quotation marks
     * within the filter string must be escaped using the backslash (\) character. For example, "
     * <code>family_name</code> = \"Reddy\"".
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i>: The name of the attribute to search for. You can only search for one attribute at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Filter-Type</i>: For an exact match, use =, for example, "<code>given_name</code> = \"Jon\"". For a prefix
     * ("starts with") match, use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AttributeValue</i>: The attribute value that must be matched for each user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the filter string is empty, <code>ListUsers</code> returns all users in the user pool.
     * </p>
     * <p>
     * You can only search for the following standard attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>username</code> (case-sensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>phone_number</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>given_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>family_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>preferred_username</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cognito:user_status</code> (called <b>Status</b> in the Console) (case-insensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sub</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Custom attributes are not searchable.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     * >Searching for Users Using the ListUsers API</a> and <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     * >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * 
     * @param filter
     *        A filter string of the form "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"". Quotation
     *        marks within the filter string must be escaped using the backslash (\) character. For example, "
     *        <code>family_name</code> = \"Reddy\"".</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeName</i>: The name of the attribute to search for. You can only search for one attribute at a
     *        time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Filter-Type</i>: For an exact match, use =, for example, "<code>given_name</code> = \"Jon\"". For a
     *        prefix ("starts with") match, use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>AttributeValue</i>: The attribute value that must be matched for each user.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the filter string is empty, <code>ListUsers</code> returns all users in the user pool.
     *        </p>
     *        <p>
     *        You can only search for the following standard attributes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>username</code> (case-sensitive)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>email</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>phone_number</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>given_name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>family_name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>preferred_username</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cognito:user_status</code> (called <b>Status</b> in the Console) (case-insensitive)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sub</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Custom attributes are not searchable.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     *        >Searching for Users Using the ListUsers API</a> and <a href=
     *        "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     *        >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito Developer Guide</i>.
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter string of the form "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"". Quotation marks
     * within the filter string must be escaped using the backslash (\) character. For example, "
     * <code>family_name</code> = \"Reddy\"".
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i>: The name of the attribute to search for. You can only search for one attribute at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Filter-Type</i>: For an exact match, use =, for example, "<code>given_name</code> = \"Jon\"". For a prefix
     * ("starts with") match, use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AttributeValue</i>: The attribute value that must be matched for each user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the filter string is empty, <code>ListUsers</code> returns all users in the user pool.
     * </p>
     * <p>
     * You can only search for the following standard attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>username</code> (case-sensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>phone_number</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>given_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>family_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>preferred_username</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cognito:user_status</code> (called <b>Status</b> in the Console) (case-insensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sub</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Custom attributes are not searchable.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     * >Searching for Users Using the ListUsers API</a> and <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     * >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * 
     * @return A filter string of the form "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"". Quotation
     *         marks within the filter string must be escaped using the backslash (\) character. For example, "
     *         <code>family_name</code> = \"Reddy\"".</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AttributeName</i>: The name of the attribute to search for. You can only search for one attribute at a
     *         time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Filter-Type</i>: For an exact match, use =, for example, "<code>given_name</code> = \"Jon\"". For a
     *         prefix ("starts with") match, use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>AttributeValue</i>: The attribute value that must be matched for each user.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the filter string is empty, <code>ListUsers</code> returns all users in the user pool.
     *         </p>
     *         <p>
     *         You can only search for the following standard attributes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>username</code> (case-sensitive)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>email</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>phone_number</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>given_name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>family_name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>preferred_username</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cognito:user_status</code> (called <b>Status</b> in the Console) (case-insensitive)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sub</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Custom attributes are not searchable.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     *         >Searching for Users Using the ListUsers API</a> and <a href=
     *         "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     *         >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito Developer Guide</i>.
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A filter string of the form "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"". Quotation marks
     * within the filter string must be escaped using the backslash (\) character. For example, "
     * <code>family_name</code> = \"Reddy\"".
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i>: The name of the attribute to search for. You can only search for one attribute at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Filter-Type</i>: For an exact match, use =, for example, "<code>given_name</code> = \"Jon\"". For a prefix
     * ("starts with") match, use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AttributeValue</i>: The attribute value that must be matched for each user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the filter string is empty, <code>ListUsers</code> returns all users in the user pool.
     * </p>
     * <p>
     * You can only search for the following standard attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>username</code> (case-sensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>phone_number</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>given_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>family_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>preferred_username</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cognito:user_status</code> (called <b>Status</b> in the Console) (case-insensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sub</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Custom attributes are not searchable.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     * >Searching for Users Using the ListUsers API</a> and <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     * >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * 
     * @param filter
     *        A filter string of the form "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"". Quotation
     *        marks within the filter string must be escaped using the backslash (\) character. For example, "
     *        <code>family_name</code> = \"Reddy\"".</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeName</i>: The name of the attribute to search for. You can only search for one attribute at a
     *        time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Filter-Type</i>: For an exact match, use =, for example, "<code>given_name</code> = \"Jon\"". For a
     *        prefix ("starts with") match, use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>AttributeValue</i>: The attribute value that must be matched for each user.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the filter string is empty, <code>ListUsers</code> returns all users in the user pool.
     *        </p>
     *        <p>
     *        You can only search for the following standard attributes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>username</code> (case-sensitive)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>email</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>phone_number</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>given_name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>family_name</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>preferred_username</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cognito:user_status</code> (called <b>Status</b> in the Console) (case-insensitive)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sub</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Custom attributes are not searchable.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     *        >Searching for Users Using the ListUsers API</a> and <a href=
     *        "http://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     *        >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withFilter(String filter) {
        setFilter(filter);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: ").append(getAttributesToGet()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: ").append(getPaginationToken()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsersRequest == false)
            return false;
        ListUsersRequest other = (ListUsersRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListUsersRequest clone() {
        return (ListUsersRequest) super.clone();
    }

}
