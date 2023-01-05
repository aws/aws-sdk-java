/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter that you apply when searching for one or more analyses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AnalysisSearchFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisSearchFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example <code>"Operator": "StringEquals"</code>.
     * Valid values are <code>"StringEquals"</code> and <code>"StringLike"</code>.
     * </p>
     * <p>
     * If you set the operator value to <code>"StringEquals"</code>, you need to provide an ownership related filter in
     * the <code>"NAME"</code> field and the arn of the user or group whose folders you want to search in the
     * <code>"Value"</code> field. For example,
     * <code>"Name":"DIRECT_QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     * .
     * </p>
     * <p>
     * If you set the value to <code>"StringLike"</code>, you need to provide the name of the folders you are searching
     * for. For example, <code>"Name":"ANALYSIS_NAME", "Operator": "StringLike", "Value": "Test"</code>. The
     * <code>"StringLike"</code> operator only supports the <code>NAME</code> value <code>ANALYSIS_NAME</code>.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The name of the value that you want to use as a filter, for example <code>"Name": "QUICKSIGHT_OWNER"</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed
     * as one of the analysis' owners or viewers are returned. Implicit permissions from folders or groups are
     * considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as one of
     * the owners of the analyses are returned. Implicit permissions from folders or groups are considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_SOLE_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     * listed as the only owner of the analysis are returned. Implicit permissions from folders or groups are not
     * considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as
     * one of the owners of the analyses are returned. Implicit permissions from folders or groups are not considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     * listed as one of the owners or viewers of the analyses are returned. Implicit permissions from folders or groups
     * are not considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANALYSIS_NAME</code>: Any analyses whose names have a substring match to this value will be returned.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter, for
     * example <code>"Value"</code>. An example is <code>"arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example <code>"Operator": "StringEquals"</code>.
     * Valid values are <code>"StringEquals"</code> and <code>"StringLike"</code>.
     * </p>
     * <p>
     * If you set the operator value to <code>"StringEquals"</code>, you need to provide an ownership related filter in
     * the <code>"NAME"</code> field and the arn of the user or group whose folders you want to search in the
     * <code>"Value"</code> field. For example,
     * <code>"Name":"DIRECT_QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     * .
     * </p>
     * <p>
     * If you set the value to <code>"StringLike"</code>, you need to provide the name of the folders you are searching
     * for. For example, <code>"Name":"ANALYSIS_NAME", "Operator": "StringLike", "Value": "Test"</code>. The
     * <code>"StringLike"</code> operator only supports the <code>NAME</code> value <code>ANALYSIS_NAME</code>.
     * </p>
     * 
     * @param operator
     *        The comparison operator that you want to use as a filter, for example
     *        <code>"Operator": "StringEquals"</code>. Valid values are <code>"StringEquals"</code> and
     *        <code>"StringLike"</code>.</p>
     *        <p>
     *        If you set the operator value to <code>"StringEquals"</code>, you need to provide an ownership related
     *        filter in the <code>"NAME"</code> field and the arn of the user or group whose folders you want to search
     *        in the <code>"Value"</code> field. For example,
     *        <code>"Name":"DIRECT_QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     *        .
     *        </p>
     *        <p>
     *        If you set the value to <code>"StringLike"</code>, you need to provide the name of the folders you are
     *        searching for. For example, <code>"Name":"ANALYSIS_NAME", "Operator": "StringLike", "Value": "Test"</code>
     *        . The <code>"StringLike"</code> operator only supports the <code>NAME</code> value
     *        <code>ANALYSIS_NAME</code>.
     * @see FilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example <code>"Operator": "StringEquals"</code>.
     * Valid values are <code>"StringEquals"</code> and <code>"StringLike"</code>.
     * </p>
     * <p>
     * If you set the operator value to <code>"StringEquals"</code>, you need to provide an ownership related filter in
     * the <code>"NAME"</code> field and the arn of the user or group whose folders you want to search in the
     * <code>"Value"</code> field. For example,
     * <code>"Name":"DIRECT_QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     * .
     * </p>
     * <p>
     * If you set the value to <code>"StringLike"</code>, you need to provide the name of the folders you are searching
     * for. For example, <code>"Name":"ANALYSIS_NAME", "Operator": "StringLike", "Value": "Test"</code>. The
     * <code>"StringLike"</code> operator only supports the <code>NAME</code> value <code>ANALYSIS_NAME</code>.
     * </p>
     * 
     * @return The comparison operator that you want to use as a filter, for example
     *         <code>"Operator": "StringEquals"</code>. Valid values are <code>"StringEquals"</code> and
     *         <code>"StringLike"</code>.</p>
     *         <p>
     *         If you set the operator value to <code>"StringEquals"</code>, you need to provide an ownership related
     *         filter in the <code>"NAME"</code> field and the arn of the user or group whose folders you want to search
     *         in the <code>"Value"</code> field. For example,
     *         <code>"Name":"DIRECT_QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     *         .
     *         </p>
     *         <p>
     *         If you set the value to <code>"StringLike"</code>, you need to provide the name of the folders you are
     *         searching for. For example,
     *         <code>"Name":"ANALYSIS_NAME", "Operator": "StringLike", "Value": "Test"</code>. The
     *         <code>"StringLike"</code> operator only supports the <code>NAME</code> value <code>ANALYSIS_NAME</code>.
     * @see FilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example <code>"Operator": "StringEquals"</code>.
     * Valid values are <code>"StringEquals"</code> and <code>"StringLike"</code>.
     * </p>
     * <p>
     * If you set the operator value to <code>"StringEquals"</code>, you need to provide an ownership related filter in
     * the <code>"NAME"</code> field and the arn of the user or group whose folders you want to search in the
     * <code>"Value"</code> field. For example,
     * <code>"Name":"DIRECT_QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     * .
     * </p>
     * <p>
     * If you set the value to <code>"StringLike"</code>, you need to provide the name of the folders you are searching
     * for. For example, <code>"Name":"ANALYSIS_NAME", "Operator": "StringLike", "Value": "Test"</code>. The
     * <code>"StringLike"</code> operator only supports the <code>NAME</code> value <code>ANALYSIS_NAME</code>.
     * </p>
     * 
     * @param operator
     *        The comparison operator that you want to use as a filter, for example
     *        <code>"Operator": "StringEquals"</code>. Valid values are <code>"StringEquals"</code> and
     *        <code>"StringLike"</code>.</p>
     *        <p>
     *        If you set the operator value to <code>"StringEquals"</code>, you need to provide an ownership related
     *        filter in the <code>"NAME"</code> field and the arn of the user or group whose folders you want to search
     *        in the <code>"Value"</code> field. For example,
     *        <code>"Name":"DIRECT_QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     *        .
     *        </p>
     *        <p>
     *        If you set the value to <code>"StringLike"</code>, you need to provide the name of the folders you are
     *        searching for. For example, <code>"Name":"ANALYSIS_NAME", "Operator": "StringLike", "Value": "Test"</code>
     *        . The <code>"StringLike"</code> operator only supports the <code>NAME</code> value
     *        <code>ANALYSIS_NAME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperator
     */

    public AnalysisSearchFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The comparison operator that you want to use as a filter, for example <code>"Operator": "StringEquals"</code>.
     * Valid values are <code>"StringEquals"</code> and <code>"StringLike"</code>.
     * </p>
     * <p>
     * If you set the operator value to <code>"StringEquals"</code>, you need to provide an ownership related filter in
     * the <code>"NAME"</code> field and the arn of the user or group whose folders you want to search in the
     * <code>"Value"</code> field. For example,
     * <code>"Name":"DIRECT_QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     * .
     * </p>
     * <p>
     * If you set the value to <code>"StringLike"</code>, you need to provide the name of the folders you are searching
     * for. For example, <code>"Name":"ANALYSIS_NAME", "Operator": "StringLike", "Value": "Test"</code>. The
     * <code>"StringLike"</code> operator only supports the <code>NAME</code> value <code>ANALYSIS_NAME</code>.
     * </p>
     * 
     * @param operator
     *        The comparison operator that you want to use as a filter, for example
     *        <code>"Operator": "StringEquals"</code>. Valid values are <code>"StringEquals"</code> and
     *        <code>"StringLike"</code>.</p>
     *        <p>
     *        If you set the operator value to <code>"StringEquals"</code>, you need to provide an ownership related
     *        filter in the <code>"NAME"</code> field and the arn of the user or group whose folders you want to search
     *        in the <code>"Value"</code> field. For example,
     *        <code>"Name":"DIRECT_QUICKSIGHT_OWNER", "Operator": "StringEquals", "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>
     *        .
     *        </p>
     *        <p>
     *        If you set the value to <code>"StringLike"</code>, you need to provide the name of the folders you are
     *        searching for. For example, <code>"Name":"ANALYSIS_NAME", "Operator": "StringLike", "Value": "Test"</code>
     *        . The <code>"StringLike"</code> operator only supports the <code>NAME</code> value
     *        <code>ANALYSIS_NAME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperator
     */

    public AnalysisSearchFilter withOperator(FilterOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter, for example <code>"Name": "QUICKSIGHT_OWNER"</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed
     * as one of the analysis' owners or viewers are returned. Implicit permissions from folders or groups are
     * considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as one of
     * the owners of the analyses are returned. Implicit permissions from folders or groups are considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_SOLE_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     * listed as the only owner of the analysis are returned. Implicit permissions from folders or groups are not
     * considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as
     * one of the owners of the analyses are returned. Implicit permissions from folders or groups are not considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     * listed as one of the owners or viewers of the analyses are returned. Implicit permissions from folders or groups
     * are not considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANALYSIS_NAME</code>: Any analyses whose names have a substring match to this value will be returned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the value that you want to use as a filter, for example
     *        <code>"Name": "QUICKSIGHT_OWNER"</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     *        listed as one of the analysis' owners or viewers are returned. Implicit permissions from folders or groups
     *        are considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as
     *        one of the owners of the analyses are returned. Implicit permissions from folders or groups are
     *        considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT_QUICKSIGHT_SOLE_OWNER</code>: Provide an ARN of a user or group, and any analyses with that
     *        ARN listed as the only owner of the analysis are returned. Implicit permissions from folders or groups are
     *        not considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT_QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     *        listed as one of the owners of the analyses are returned. Implicit permissions from folders or groups are
     *        not considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT_QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with
     *        that ARN listed as one of the owners or viewers of the analyses are returned. Implicit permissions from
     *        folders or groups are not considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANALYSIS_NAME</code>: Any analyses whose names have a substring match to this value will be
     *        returned.
     *        </p>
     *        </li>
     * @see AnalysisFilterAttribute
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter, for example <code>"Name": "QUICKSIGHT_OWNER"</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed
     * as one of the analysis' owners or viewers are returned. Implicit permissions from folders or groups are
     * considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as one of
     * the owners of the analyses are returned. Implicit permissions from folders or groups are considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_SOLE_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     * listed as the only owner of the analysis are returned. Implicit permissions from folders or groups are not
     * considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as
     * one of the owners of the analyses are returned. Implicit permissions from folders or groups are not considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     * listed as one of the owners or viewers of the analyses are returned. Implicit permissions from folders or groups
     * are not considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANALYSIS_NAME</code>: Any analyses whose names have a substring match to this value will be returned.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the value that you want to use as a filter, for example
     *         <code>"Name": "QUICKSIGHT_OWNER"</code>.</p>
     *         <p>
     *         Valid values are defined as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that
     *         ARN listed as one of the analysis' owners or viewers are returned. Implicit permissions from folders or
     *         groups are considered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed
     *         as one of the owners of the analyses are returned. Implicit permissions from folders or groups are
     *         considered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DIRECT_QUICKSIGHT_SOLE_OWNER</code>: Provide an ARN of a user or group, and any analyses with that
     *         ARN listed as the only owner of the analysis are returned. Implicit permissions from folders or groups
     *         are not considered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DIRECT_QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     *         listed as one of the owners of the analyses are returned. Implicit permissions from folders or groups are
     *         not considered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DIRECT_QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with
     *         that ARN listed as one of the owners or viewers of the analyses are returned. Implicit permissions from
     *         folders or groups are not considered.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ANALYSIS_NAME</code>: Any analyses whose names have a substring match to this value will be
     *         returned.
     *         </p>
     *         </li>
     * @see AnalysisFilterAttribute
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter, for example <code>"Name": "QUICKSIGHT_OWNER"</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed
     * as one of the analysis' owners or viewers are returned. Implicit permissions from folders or groups are
     * considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as one of
     * the owners of the analyses are returned. Implicit permissions from folders or groups are considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_SOLE_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     * listed as the only owner of the analysis are returned. Implicit permissions from folders or groups are not
     * considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as
     * one of the owners of the analyses are returned. Implicit permissions from folders or groups are not considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     * listed as one of the owners or viewers of the analyses are returned. Implicit permissions from folders or groups
     * are not considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANALYSIS_NAME</code>: Any analyses whose names have a substring match to this value will be returned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the value that you want to use as a filter, for example
     *        <code>"Name": "QUICKSIGHT_OWNER"</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     *        listed as one of the analysis' owners or viewers are returned. Implicit permissions from folders or groups
     *        are considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as
     *        one of the owners of the analyses are returned. Implicit permissions from folders or groups are
     *        considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT_QUICKSIGHT_SOLE_OWNER</code>: Provide an ARN of a user or group, and any analyses with that
     *        ARN listed as the only owner of the analysis are returned. Implicit permissions from folders or groups are
     *        not considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT_QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     *        listed as one of the owners of the analyses are returned. Implicit permissions from folders or groups are
     *        not considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT_QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with
     *        that ARN listed as one of the owners or viewers of the analyses are returned. Implicit permissions from
     *        folders or groups are not considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANALYSIS_NAME</code>: Any analyses whose names have a substring match to this value will be
     *        returned.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisFilterAttribute
     */

    public AnalysisSearchFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter, for example <code>"Name": "QUICKSIGHT_OWNER"</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed
     * as one of the analysis' owners or viewers are returned. Implicit permissions from folders or groups are
     * considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as one of
     * the owners of the analyses are returned. Implicit permissions from folders or groups are considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_SOLE_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     * listed as the only owner of the analysis are returned. Implicit permissions from folders or groups are not
     * considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as
     * one of the owners of the analyses are returned. Implicit permissions from folders or groups are not considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DIRECT_QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     * listed as one of the owners or viewers of the analyses are returned. Implicit permissions from folders or groups
     * are not considered.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANALYSIS_NAME</code>: Any analyses whose names have a substring match to this value will be returned.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the value that you want to use as a filter, for example
     *        <code>"Name": "QUICKSIGHT_OWNER"</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     *        listed as one of the analysis' owners or viewers are returned. Implicit permissions from folders or groups
     *        are considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN listed as
     *        one of the owners of the analyses are returned. Implicit permissions from folders or groups are
     *        considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT_QUICKSIGHT_SOLE_OWNER</code>: Provide an ARN of a user or group, and any analyses with that
     *        ARN listed as the only owner of the analysis are returned. Implicit permissions from folders or groups are
     *        not considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT_QUICKSIGHT_OWNER</code>: Provide an ARN of a user or group, and any analyses with that ARN
     *        listed as one of the owners of the analyses are returned. Implicit permissions from folders or groups are
     *        not considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DIRECT_QUICKSIGHT_VIEWER_OR_OWNER</code>: Provide an ARN of a user or group, and any analyses with
     *        that ARN listed as one of the owners or viewers of the analyses are returned. Implicit permissions from
     *        folders or groups are not considered.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANALYSIS_NAME</code>: Any analyses whose names have a substring match to this value will be
     *        returned.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisFilterAttribute
     */

    public AnalysisSearchFilter withName(AnalysisFilterAttribute name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter, for
     * example <code>"Value"</code>. An example is <code>"arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     * </p>
     * 
     * @param value
     *        The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter,
     *        for example <code>"Value"</code>. An example is
     *        <code>"arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter, for
     * example <code>"Value"</code>. An example is <code>"arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     * </p>
     * 
     * @return The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter,
     *         for example <code>"Value"</code>. An example is
     *         <code>"arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter, for
     * example <code>"Value"</code>. An example is <code>"arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     * </p>
     * 
     * @param value
     *        The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter,
     *        for example <code>"Value"</code>. An example is
     *        <code>"arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSearchFilter withValue(String value) {
        setValue(value);
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
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisSearchFilter == false)
            return false;
        AnalysisSearchFilter other = (AnalysisSearchFilter) obj;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisSearchFilter clone() {
        try {
            return (AnalysisSearchFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnalysisSearchFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
