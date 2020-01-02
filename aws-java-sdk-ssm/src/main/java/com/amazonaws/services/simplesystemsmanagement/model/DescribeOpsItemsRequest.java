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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeOpsItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOpsItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more filters to limit the reponse.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key: CreatedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedBy
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Priority
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Source
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Status
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Title
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalData*
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataKey
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataValue
     * </p>
     * <p>
     * Operations: Equals, Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OpsItemId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: ResourceId
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: AutomationId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * </ul>
     * <p>
     * *If you filter the response by using the OperationalData operator, specify a key-value pair by using the
     * following JSON format: {"key":"key_name","value":"a_value"}
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OpsItemFilter> opsItemFilters;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more filters to limit the reponse.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key: CreatedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedBy
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Priority
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Source
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Status
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Title
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalData*
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataKey
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataValue
     * </p>
     * <p>
     * Operations: Equals, Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OpsItemId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: ResourceId
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: AutomationId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * </ul>
     * <p>
     * *If you filter the response by using the OperationalData operator, specify a key-value pair by using the
     * following JSON format: {"key":"key_name","value":"a_value"}
     * </p>
     * 
     * @return One or more filters to limit the reponse.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key: CreatedTime
     *         </p>
     *         <p>
     *         Operations: GreaterThan, LessThan
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: LastModifiedBy
     *         </p>
     *         <p>
     *         Operations: Contains, Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: LastModifiedTime
     *         </p>
     *         <p>
     *         Operations: GreaterThan, LessThan
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: Priority
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: Source
     *         </p>
     *         <p>
     *         Operations: Contains, Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: Status
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: Title
     *         </p>
     *         <p>
     *         Operations: Contains
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: OperationalData*
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: OperationalDataKey
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: OperationalDataValue
     *         </p>
     *         <p>
     *         Operations: Equals, Contains
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: OpsItemId
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: ResourceId
     *         </p>
     *         <p>
     *         Operations: Contains
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: AutomationId
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you filter the response by using the OperationalData operator, specify a key-value pair by using the
     *         following JSON format: {"key":"key_name","value":"a_value"}
     */

    public java.util.List<OpsItemFilter> getOpsItemFilters() {
        if (opsItemFilters == null) {
            opsItemFilters = new com.amazonaws.internal.SdkInternalList<OpsItemFilter>();
        }
        return opsItemFilters;
    }

    /**
     * <p>
     * One or more filters to limit the reponse.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key: CreatedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedBy
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Priority
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Source
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Status
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Title
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalData*
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataKey
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataValue
     * </p>
     * <p>
     * Operations: Equals, Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OpsItemId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: ResourceId
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: AutomationId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * </ul>
     * <p>
     * *If you filter the response by using the OperationalData operator, specify a key-value pair by using the
     * following JSON format: {"key":"key_name","value":"a_value"}
     * </p>
     * 
     * @param opsItemFilters
     *        One or more filters to limit the reponse.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key: CreatedTime
     *        </p>
     *        <p>
     *        Operations: GreaterThan, LessThan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: LastModifiedBy
     *        </p>
     *        <p>
     *        Operations: Contains, Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: LastModifiedTime
     *        </p>
     *        <p>
     *        Operations: GreaterThan, LessThan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Priority
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Source
     *        </p>
     *        <p>
     *        Operations: Contains, Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Status
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Title
     *        </p>
     *        <p>
     *        Operations: Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OperationalData*
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OperationalDataKey
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OperationalDataValue
     *        </p>
     *        <p>
     *        Operations: Equals, Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OpsItemId
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: ResourceId
     *        </p>
     *        <p>
     *        Operations: Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: AutomationId
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you filter the response by using the OperationalData operator, specify a key-value pair by using the
     *        following JSON format: {"key":"key_name","value":"a_value"}
     */

    public void setOpsItemFilters(java.util.Collection<OpsItemFilter> opsItemFilters) {
        if (opsItemFilters == null) {
            this.opsItemFilters = null;
            return;
        }

        this.opsItemFilters = new com.amazonaws.internal.SdkInternalList<OpsItemFilter>(opsItemFilters);
    }

    /**
     * <p>
     * One or more filters to limit the reponse.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key: CreatedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedBy
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Priority
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Source
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Status
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Title
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalData*
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataKey
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataValue
     * </p>
     * <p>
     * Operations: Equals, Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OpsItemId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: ResourceId
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: AutomationId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * </ul>
     * <p>
     * *If you filter the response by using the OperationalData operator, specify a key-value pair by using the
     * following JSON format: {"key":"key_name","value":"a_value"}
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOpsItemFilters(java.util.Collection)} or {@link #withOpsItemFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param opsItemFilters
     *        One or more filters to limit the reponse.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key: CreatedTime
     *        </p>
     *        <p>
     *        Operations: GreaterThan, LessThan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: LastModifiedBy
     *        </p>
     *        <p>
     *        Operations: Contains, Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: LastModifiedTime
     *        </p>
     *        <p>
     *        Operations: GreaterThan, LessThan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Priority
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Source
     *        </p>
     *        <p>
     *        Operations: Contains, Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Status
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Title
     *        </p>
     *        <p>
     *        Operations: Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OperationalData*
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OperationalDataKey
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OperationalDataValue
     *        </p>
     *        <p>
     *        Operations: Equals, Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OpsItemId
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: ResourceId
     *        </p>
     *        <p>
     *        Operations: Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: AutomationId
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you filter the response by using the OperationalData operator, specify a key-value pair by using the
     *        following JSON format: {"key":"key_name","value":"a_value"}
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOpsItemsRequest withOpsItemFilters(OpsItemFilter... opsItemFilters) {
        if (this.opsItemFilters == null) {
            setOpsItemFilters(new com.amazonaws.internal.SdkInternalList<OpsItemFilter>(opsItemFilters.length));
        }
        for (OpsItemFilter ele : opsItemFilters) {
            this.opsItemFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters to limit the reponse.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key: CreatedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedBy
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Priority
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Source
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Status
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Title
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalData*
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataKey
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataValue
     * </p>
     * <p>
     * Operations: Equals, Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OpsItemId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: ResourceId
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: AutomationId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * </ul>
     * <p>
     * *If you filter the response by using the OperationalData operator, specify a key-value pair by using the
     * following JSON format: {"key":"key_name","value":"a_value"}
     * </p>
     * 
     * @param opsItemFilters
     *        One or more filters to limit the reponse.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key: CreatedTime
     *        </p>
     *        <p>
     *        Operations: GreaterThan, LessThan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: LastModifiedBy
     *        </p>
     *        <p>
     *        Operations: Contains, Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: LastModifiedTime
     *        </p>
     *        <p>
     *        Operations: GreaterThan, LessThan
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Priority
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Source
     *        </p>
     *        <p>
     *        Operations: Contains, Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Status
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: Title
     *        </p>
     *        <p>
     *        Operations: Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OperationalData*
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OperationalDataKey
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OperationalDataValue
     *        </p>
     *        <p>
     *        Operations: Equals, Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: OpsItemId
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: ResourceId
     *        </p>
     *        <p>
     *        Operations: Contains
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key: AutomationId
     *        </p>
     *        <p>
     *        Operations: Equals
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you filter the response by using the OperationalData operator, specify a key-value pair by using the
     *        following JSON format: {"key":"key_name","value":"a_value"}
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOpsItemsRequest withOpsItemFilters(java.util.Collection<OpsItemFilter> opsItemFilters) {
        setOpsItemFilters(opsItemFilters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOpsItemsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOpsItemsRequest withNextToken(String nextToken) {
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
        if (getOpsItemFilters() != null)
            sb.append("OpsItemFilters: ").append(getOpsItemFilters()).append(",");
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

        if (obj instanceof DescribeOpsItemsRequest == false)
            return false;
        DescribeOpsItemsRequest other = (DescribeOpsItemsRequest) obj;
        if (other.getOpsItemFilters() == null ^ this.getOpsItemFilters() == null)
            return false;
        if (other.getOpsItemFilters() != null && other.getOpsItemFilters().equals(this.getOpsItemFilters()) == false)
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

        hashCode = prime * hashCode + ((getOpsItemFilters() == null) ? 0 : getOpsItemFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOpsItemsRequest clone() {
        return (DescribeOpsItemsRequest) super.clone();
    }

}
