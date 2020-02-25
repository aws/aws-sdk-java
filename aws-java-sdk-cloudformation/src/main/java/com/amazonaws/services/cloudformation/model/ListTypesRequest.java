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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     * Currently, AWS CloudFormation marks any types you create as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>PRIVATE</code>.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration,
     * based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and must
     * instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include create, read, and delete handlers, and therefore cannot
     * actually be provisioned.
     * </p>
     * </li>
     * </ul>
     */
    private String provisioningType;
    /**
     * <p>
     * The deprecation status of the types that you want to get summary information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered for use in CloudFormation operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     */
    private String deprecatedStatus;
    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     * Currently, AWS CloudFormation marks any types you create as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>PRIVATE</code>.
     * </p>
     * 
     * @param visibility
     *        The scope at which the type is visible and usable in CloudFormation operations.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     *        Currently, AWS CloudFormation marks any types you create as <code>PRIVATE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>PRIVATE</code>.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     * Currently, AWS CloudFormation marks any types you create as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>PRIVATE</code>.
     * </p>
     * 
     * @return The scope at which the type is visible and usable in CloudFormation operations.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     *         Currently, AWS CloudFormation marks any types you create as <code>PRIVATE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default is <code>PRIVATE</code>.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     * Currently, AWS CloudFormation marks any types you create as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>PRIVATE</code>.
     * </p>
     * 
     * @param visibility
     *        The scope at which the type is visible and usable in CloudFormation operations.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     *        Currently, AWS CloudFormation marks any types you create as <code>PRIVATE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>PRIVATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ListTypesRequest withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The scope at which the type is visible and usable in CloudFormation operations.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     * Currently, AWS CloudFormation marks any types you create as <code>PRIVATE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>PRIVATE</code>.
     * </p>
     * 
     * @param visibility
     *        The scope at which the type is visible and usable in CloudFormation operations.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRIVATE</code>: The type is only visible and usable within the account in which it is registered.
     *        Currently, AWS CloudFormation marks any types you create as <code>PRIVATE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PUBLIC</code>: The type is publically visible and usable within any Amazon account.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>PRIVATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ListTypesRequest withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration,
     * based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and must
     * instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include create, read, and delete handlers, and therefore cannot
     * actually be provisioned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param provisioningType
     *        The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during
     *        registration, based on the types of handlers in the schema handler package submitted.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during
     *        stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and
     *        must instead be replaced during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROVISIONABLE</code>: The type does not include create, read, and delete handlers, and therefore
     *        cannot actually be provisioned.
     *        </p>
     *        </li>
     * @see ProvisioningType
     */

    public void setProvisioningType(String provisioningType) {
        this.provisioningType = provisioningType;
    }

    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration,
     * based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and must
     * instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include create, read, and delete handlers, and therefore cannot
     * actually be provisioned.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during
     *         registration, based on the types of handlers in the schema handler package submitted.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during
     *         stack update operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and
     *         must instead be replaced during stack update operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NON_PROVISIONABLE</code>: The type does not include create, read, and delete handlers, and
     *         therefore cannot actually be provisioned.
     *         </p>
     *         </li>
     * @see ProvisioningType
     */

    public String getProvisioningType() {
        return this.provisioningType;
    }

    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration,
     * based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and must
     * instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include create, read, and delete handlers, and therefore cannot
     * actually be provisioned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param provisioningType
     *        The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during
     *        registration, based on the types of handlers in the schema handler package submitted.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during
     *        stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and
     *        must instead be replaced during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROVISIONABLE</code>: The type does not include create, read, and delete handlers, and therefore
     *        cannot actually be provisioned.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningType
     */

    public ListTypesRequest withProvisioningType(String provisioningType) {
        setProvisioningType(provisioningType);
        return this;
    }

    /**
     * <p>
     * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration,
     * based on the types of handlers in the schema handler package submitted.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during stack
     * update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and must
     * instead be replaced during stack update operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_PROVISIONABLE</code>: The type does not include create, read, and delete handlers, and therefore cannot
     * actually be provisioned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param provisioningType
     *        The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during
     *        registration, based on the types of handlers in the schema handler package submitted.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FULLY_MUTABLE</code>: The type includes an update handler to process updates to the type during
     *        stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IMMUTABLE</code>: The type does not include an update handler, so the type cannot be updated and
     *        must instead be replaced during stack update operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_PROVISIONABLE</code>: The type does not include create, read, and delete handlers, and therefore
     *        cannot actually be provisioned.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningType
     */

    public ListTypesRequest withProvisioningType(ProvisioningType provisioningType) {
        this.provisioningType = provisioningType.toString();
        return this;
    }

    /**
     * <p>
     * The deprecation status of the types that you want to get summary information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered for use in CloudFormation operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the types that you want to get summary information about.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The type is registered for use in CloudFormation operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation
     *        operations.
     *        </p>
     *        </li>
     * @see DeprecatedStatus
     */

    public void setDeprecatedStatus(String deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the types that you want to get summary information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered for use in CloudFormation operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The deprecation status of the types that you want to get summary information about.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LIVE</code>: The type is registered for use in CloudFormation operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation
     *         operations.
     *         </p>
     *         </li>
     * @see DeprecatedStatus
     */

    public String getDeprecatedStatus() {
        return this.deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the types that you want to get summary information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered for use in CloudFormation operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the types that you want to get summary information about.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The type is registered for use in CloudFormation operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation
     *        operations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeprecatedStatus
     */

    public ListTypesRequest withDeprecatedStatus(String deprecatedStatus) {
        setDeprecatedStatus(deprecatedStatus);
        return this;
    }

    /**
     * <p>
     * The deprecation status of the types that you want to get summary information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type is registered for use in CloudFormation operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deprecatedStatus
     *        The deprecation status of the types that you want to get summary information about.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LIVE</code>: The type is registered for use in CloudFormation operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DEPRECATED</code>: The type has been deregistered and can no longer be used in CloudFormation
     *        operations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeprecatedStatus
     */

    public ListTypesRequest withDeprecatedStatus(DeprecatedStatus deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned with a single call. If the number of available results
     *        exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *        <code>NextToken</code> request parameter to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @return The maximum number of results to be returned with a single call. If the number of available results
     *         exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *         <code>NextToken</code> request parameter to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned with a single call. If the number of available results
     *        exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *        <code>NextToken</code> request parameter to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request didn't return all of the remaining results, the response object's
     *        <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *        action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *        no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *        <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @return If the previous paginated request didn't return all of the remaining results, the response object's
     *         <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *         action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *         no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *         <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request didn't return all of the remaining results, the response object's
     *        <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *        action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *        no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTypesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getProvisioningType() != null)
            sb.append("ProvisioningType: ").append(getProvisioningType()).append(",");
        if (getDeprecatedStatus() != null)
            sb.append("DeprecatedStatus: ").append(getDeprecatedStatus()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTypesRequest == false)
            return false;
        ListTypesRequest other = (ListTypesRequest) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getProvisioningType() == null ^ this.getProvisioningType() == null)
            return false;
        if (other.getProvisioningType() != null && other.getProvisioningType().equals(this.getProvisioningType()) == false)
            return false;
        if (other.getDeprecatedStatus() == null ^ this.getDeprecatedStatus() == null)
            return false;
        if (other.getDeprecatedStatus() != null && other.getDeprecatedStatus().equals(this.getDeprecatedStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getProvisioningType() == null) ? 0 : getProvisioningType().hashCode());
        hashCode = prime * hashCode + ((getDeprecatedStatus() == null) ? 0 : getDeprecatedStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTypesRequest clone() {
        return (ListTypesRequest) super.clone();
    }

}
