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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A conditional statement for a search expression that includes a Boolean operator, a resource property, and a value.
 * </p>
 * <p>
 * If you don't specify an <code>Operator</code> and a <code>Value</code>, the filter searches for only the specified
 * property. For example, defining a <code>Filter</code> for the <code>FailureReason</code> for the
 * <code>TrainingJob</code> <code>Resource</code> searches for training job objects that have a value in the
 * <code>FailureReason</code> field.
 * </p>
 * <p>
 * If you specify a <code>Value</code>, but not an <code>Operator</code>, Amazon SageMaker uses the equals operator as
 * the default.
 * </p>
 * <p>
 * In search, there are several property types:
 * </p>
 * <dl>
 * <dt>Metrics</dt>
 * <dd>
 * <p>
 * To define a metric filter, enter a value using the form <code>"Metrics.&lt;name&gt;"</code>, where
 * <code>&lt;name&gt;</code> is a metric name. For example, the following filter searches for training jobs with an
 * <code>"accuracy"</code> metric greater than <code>"0.9"</code>:
 * </p>
 * <p>
 * <code>{</code>
 * </p>
 * <p>
 * <code>"Name": "Metrics.accuracy",</code>
 * </p>
 * <p>
 * <code>"Operator": "GREATER_THAN",</code>
 * </p>
 * <p>
 * <code>"Value": "0.9"</code>
 * </p>
 * <p>
 * <code>}</code>
 * </p>
 * </dd>
 * <dt>HyperParameters</dt>
 * <dd>
 * <p>
 * To define a hyperparameter filter, enter a value with the form <code>"HyperParameters.&lt;name&gt;"</code>. Decimal
 * hyperparameter values are treated as a decimal in a comparison if the specified <code>Value</code> is also a decimal
 * value. If the specified <code>Value</code> is an integer, the decimal hyperparameter values are treated as integers.
 * For example, the following filter is satisfied by training jobs with a <code>"learning_rate"</code> hyperparameter
 * that is less than <code>"0.5"</code>:
 * </p>
 * <p>
 * <code> {</code>
 * </p>
 * <p>
 * <code> "Name": "HyperParameters.learning_rate",</code>
 * </p>
 * <p>
 * <code> "Operator": "LESS_THAN",</code>
 * </p>
 * <p>
 * <code> "Value": "0.5"</code>
 * </p>
 * <p>
 * <code> }</code>
 * </p>
 * </dd>
 * <dt>Tags</dt>
 * <dd>
 * <p>
 * To define a tag filter, enter a value with the form <code>"Tags.&lt;key&gt;"</code>.
 * </p>
 * </dd>
 * </dl>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A property name. For example, <code>TrainingJobName</code>. For the list of valid property names returned in a
     * search result for each supported resource, see <a>TrainingJob</a> properties. You must specify a valid property
     * name for the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the following
     * values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> equals the specified <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> does not equal the specified <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is greater than the specified <code>Value</code>. Not supported for
     * text-based properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is greater than or equal to the specified <code>Value</code>. Not
     * supported for text-based properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is less than the specified <code>Value</code>. Not supported for
     * text-based properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is less than or equal to the specified <code>Value</code>. Not
     * supported for text-based properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * Only supported for text-based properties. The word-list of the property contains the specified <code>Value</code>
     * .
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If you have specified a filter <code>Value</code>, the default is <code>Equals</code>.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * A value used with <code>Resource</code> and <code>Operator</code> to determine if objects satisfy the filter's
     * condition. For numerical properties, <code>Value</code> must be an integer or floating-point decimal. For
     * timestamp properties, <code>Value</code> must be an ISO 8601 date-time string of the following format:
     * <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * A property name. For example, <code>TrainingJobName</code>. For the list of valid property names returned in a
     * search result for each supported resource, see <a>TrainingJob</a> properties. You must specify a valid property
     * name for the resource.
     * </p>
     * 
     * @param name
     *        A property name. For example, <code>TrainingJobName</code>. For the list of valid property names returned
     *        in a search result for each supported resource, see <a>TrainingJob</a> properties. You must specify a
     *        valid property name for the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A property name. For example, <code>TrainingJobName</code>. For the list of valid property names returned in a
     * search result for each supported resource, see <a>TrainingJob</a> properties. You must specify a valid property
     * name for the resource.
     * </p>
     * 
     * @return A property name. For example, <code>TrainingJobName</code>. For the list of valid property names returned
     *         in a search result for each supported resource, see <a>TrainingJob</a> properties. You must specify a
     *         valid property name for the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A property name. For example, <code>TrainingJobName</code>. For the list of valid property names returned in a
     * search result for each supported resource, see <a>TrainingJob</a> properties. You must specify a valid property
     * name for the resource.
     * </p>
     * 
     * @param name
     *        A property name. For example, <code>TrainingJobName</code>. For the list of valid property names returned
     *        in a search result for each supported resource, see <a>TrainingJob</a> properties. You must specify a
     *        valid property name for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the following
     * values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> equals the specified <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> does not equal the specified <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is greater than the specified <code>Value</code>. Not supported for
     * text-based properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is greater than or equal to the specified <code>Value</code>. Not
     * supported for text-based properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is less than the specified <code>Value</code>. Not supported for
     * text-based properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is less than or equal to the specified <code>Value</code>. Not
     * supported for text-based properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * Only supported for text-based properties. The word-list of the property contains the specified <code>Value</code>
     * .
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If you have specified a filter <code>Value</code>, the default is <code>Equals</code>.
     * </p>
     * 
     * @param operator
     *        A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the
     *        following values:</p>
     *        <dl>
     *        <dt>Equals</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> equals the specified <code>Value</code>.
     *        </p>
     *        </dd>
     *        <dt>NotEquals</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> does not equal the specified <code>Value</code>.
     *        </p>
     *        </dd>
     *        <dt>GreaterThan</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is greater than the specified <code>Value</code>. Not
     *        supported for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>GreaterThanOrEqualTo</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is greater than or equal to the specified <code>Value</code>.
     *        Not supported for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>LessThan</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is less than the specified <code>Value</code>. Not supported
     *        for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>LessThanOrEqualTo</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is less than or equal to the specified <code>Value</code>. Not
     *        supported for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>Contains</dt>
     *        <dd>
     *        <p>
     *        Only supported for text-based properties. The word-list of the property contains the specified
     *        <code>Value</code>.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        If you have specified a filter <code>Value</code>, the default is <code>Equals</code>.
     * @see Operator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the following
     * values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> equals the specified <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> does not equal the specified <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is greater than the specified <code>Value</code>. Not supported for
     * text-based properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is greater than or equal to the specified <code>Value</code>. Not
     * supported for text-based properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is less than the specified <code>Value</code>. Not supported for
     * text-based properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is less than or equal to the specified <code>Value</code>. Not
     * supported for text-based properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * Only supported for text-based properties. The word-list of the property contains the specified <code>Value</code>
     * .
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If you have specified a filter <code>Value</code>, the default is <code>Equals</code>.
     * </p>
     * 
     * @return A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the
     *         following values:</p>
     *         <dl>
     *         <dt>Equals</dt>
     *         <dd>
     *         <p>
     *         The specified resource in <code>Name</code> equals the specified <code>Value</code>.
     *         </p>
     *         </dd>
     *         <dt>NotEquals</dt>
     *         <dd>
     *         <p>
     *         The specified resource in <code>Name</code> does not equal the specified <code>Value</code>.
     *         </p>
     *         </dd>
     *         <dt>GreaterThan</dt>
     *         <dd>
     *         <p>
     *         The specified resource in <code>Name</code> is greater than the specified <code>Value</code>. Not
     *         supported for text-based properties.
     *         </p>
     *         </dd>
     *         <dt>GreaterThanOrEqualTo</dt>
     *         <dd>
     *         <p>
     *         The specified resource in <code>Name</code> is greater than or equal to the specified <code>Value</code>.
     *         Not supported for text-based properties.
     *         </p>
     *         </dd>
     *         <dt>LessThan</dt>
     *         <dd>
     *         <p>
     *         The specified resource in <code>Name</code> is less than the specified <code>Value</code>. Not supported
     *         for text-based properties.
     *         </p>
     *         </dd>
     *         <dt>LessThanOrEqualTo</dt>
     *         <dd>
     *         <p>
     *         The specified resource in <code>Name</code> is less than or equal to the specified <code>Value</code>.
     *         Not supported for text-based properties.
     *         </p>
     *         </dd>
     *         <dt>Contains</dt>
     *         <dd>
     *         <p>
     *         Only supported for text-based properties. The word-list of the property contains the specified
     *         <code>Value</code>.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         If you have specified a filter <code>Value</code>, the default is <code>Equals</code>.
     * @see Operator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the following
     * values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> equals the specified <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> does not equal the specified <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is greater than the specified <code>Value</code>. Not supported for
     * text-based properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is greater than or equal to the specified <code>Value</code>. Not
     * supported for text-based properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is less than the specified <code>Value</code>. Not supported for
     * text-based properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is less than or equal to the specified <code>Value</code>. Not
     * supported for text-based properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * Only supported for text-based properties. The word-list of the property contains the specified <code>Value</code>
     * .
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If you have specified a filter <code>Value</code>, the default is <code>Equals</code>.
     * </p>
     * 
     * @param operator
     *        A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the
     *        following values:</p>
     *        <dl>
     *        <dt>Equals</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> equals the specified <code>Value</code>.
     *        </p>
     *        </dd>
     *        <dt>NotEquals</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> does not equal the specified <code>Value</code>.
     *        </p>
     *        </dd>
     *        <dt>GreaterThan</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is greater than the specified <code>Value</code>. Not
     *        supported for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>GreaterThanOrEqualTo</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is greater than or equal to the specified <code>Value</code>.
     *        Not supported for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>LessThan</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is less than the specified <code>Value</code>. Not supported
     *        for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>LessThanOrEqualTo</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is less than or equal to the specified <code>Value</code>. Not
     *        supported for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>Contains</dt>
     *        <dd>
     *        <p>
     *        Only supported for text-based properties. The word-list of the property contains the specified
     *        <code>Value</code>.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        If you have specified a filter <code>Value</code>, the default is <code>Equals</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public Filter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the following
     * values:
     * </p>
     * <dl>
     * <dt>Equals</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> equals the specified <code>Value</code>.
     * </p>
     * </dd>
     * <dt>NotEquals</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> does not equal the specified <code>Value</code>.
     * </p>
     * </dd>
     * <dt>GreaterThan</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is greater than the specified <code>Value</code>. Not supported for
     * text-based properties.
     * </p>
     * </dd>
     * <dt>GreaterThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is greater than or equal to the specified <code>Value</code>. Not
     * supported for text-based properties.
     * </p>
     * </dd>
     * <dt>LessThan</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is less than the specified <code>Value</code>. Not supported for
     * text-based properties.
     * </p>
     * </dd>
     * <dt>LessThanOrEqualTo</dt>
     * <dd>
     * <p>
     * The specified resource in <code>Name</code> is less than or equal to the specified <code>Value</code>. Not
     * supported for text-based properties.
     * </p>
     * </dd>
     * <dt>Contains</dt>
     * <dd>
     * <p>
     * Only supported for text-based properties. The word-list of the property contains the specified <code>Value</code>
     * .
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If you have specified a filter <code>Value</code>, the default is <code>Equals</code>.
     * </p>
     * 
     * @param operator
     *        A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the
     *        following values:</p>
     *        <dl>
     *        <dt>Equals</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> equals the specified <code>Value</code>.
     *        </p>
     *        </dd>
     *        <dt>NotEquals</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> does not equal the specified <code>Value</code>.
     *        </p>
     *        </dd>
     *        <dt>GreaterThan</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is greater than the specified <code>Value</code>. Not
     *        supported for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>GreaterThanOrEqualTo</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is greater than or equal to the specified <code>Value</code>.
     *        Not supported for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>LessThan</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is less than the specified <code>Value</code>. Not supported
     *        for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>LessThanOrEqualTo</dt>
     *        <dd>
     *        <p>
     *        The specified resource in <code>Name</code> is less than or equal to the specified <code>Value</code>. Not
     *        supported for text-based properties.
     *        </p>
     *        </dd>
     *        <dt>Contains</dt>
     *        <dd>
     *        <p>
     *        Only supported for text-based properties. The word-list of the property contains the specified
     *        <code>Value</code>.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        If you have specified a filter <code>Value</code>, the default is <code>Equals</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public Filter withOperator(Operator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * A value used with <code>Resource</code> and <code>Operator</code> to determine if objects satisfy the filter's
     * condition. For numerical properties, <code>Value</code> must be an integer or floating-point decimal. For
     * timestamp properties, <code>Value</code> must be an ISO 8601 date-time string of the following format:
     * <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     * </p>
     * 
     * @param value
     *        A value used with <code>Resource</code> and <code>Operator</code> to determine if objects satisfy the
     *        filter's condition. For numerical properties, <code>Value</code> must be an integer or floating-point
     *        decimal. For timestamp properties, <code>Value</code> must be an ISO 8601 date-time string of the
     *        following format: <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A value used with <code>Resource</code> and <code>Operator</code> to determine if objects satisfy the filter's
     * condition. For numerical properties, <code>Value</code> must be an integer or floating-point decimal. For
     * timestamp properties, <code>Value</code> must be an ISO 8601 date-time string of the following format:
     * <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     * </p>
     * 
     * @return A value used with <code>Resource</code> and <code>Operator</code> to determine if objects satisfy the
     *         filter's condition. For numerical properties, <code>Value</code> must be an integer or floating-point
     *         decimal. For timestamp properties, <code>Value</code> must be an ISO 8601 date-time string of the
     *         following format: <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A value used with <code>Resource</code> and <code>Operator</code> to determine if objects satisfy the filter's
     * condition. For numerical properties, <code>Value</code> must be an integer or floating-point decimal. For
     * timestamp properties, <code>Value</code> must be an ISO 8601 date-time string of the following format:
     * <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     * </p>
     * 
     * @param value
     *        A value used with <code>Resource</code> and <code>Operator</code> to determine if objects satisfy the
     *        filter's condition. For numerical properties, <code>Value</code> must be an integer or floating-point
     *        decimal. For timestamp properties, <code>Value</code> must be an ISO 8601 date-time string of the
     *        following format: <code>YYYY-mm-dd'T'HH:MM:SS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValue(String value) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
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

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
