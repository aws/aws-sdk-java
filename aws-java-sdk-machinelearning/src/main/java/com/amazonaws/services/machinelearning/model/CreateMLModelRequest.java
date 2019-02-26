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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMLModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     */
    private String mLModelName;
    /**
     * <p>
     * The category of supervised learning that this <code>MLModel</code> will address. Choose from the following types:
     * </p>
     * <ul>
     * <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     * <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     * <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     * </ul>
     * <p>
     * For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine
     * Learning Developer Guide</a>.
     * </p>
     */
    private String mLModelType;
    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of key-value
     * pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input data, the
     * size of the model might affect its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value is
     * <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to build
     * the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to <code>10000</code>. The
     * default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling the data improves a
     * model's ability to find the optimal solution for a variety of data types. The valid values are <code>auto</code>
     * and <code>none</code>. The default value is <code>none</code>. We <?oxy_insert_start author="laurama"
     * timestamp="20160329T131121-0700">strongly recommend that you shuffle your data.<?oxy_insert_end>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L1
     * normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this
     * parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L2
     * normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> parameters;
    /**
     * <p>
     * The <code>DataSource</code> that points to the training data.
     * </p>
     */
    private String trainingDataSourceId;
    /**
     * <p>
     * The data recipe for creating the <code>MLModel</code>. You must specify either the recipe or its URI. If you
     * don't specify a recipe or its URI, Amazon ML creates a default.
     * </p>
     */
    private String recipe;
    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) location and file name that contains the <code>MLModel</code>
     * recipe. You must specify either the recipe or its URI. If you don't specify a recipe or its URI, Amazon ML
     * creates a default.
     * </p>
     */
    private String recipeUri;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * </p>
     * 
     * @param mLModelId
     *        A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * </p>
     * 
     * @param mLModelId
     *        A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLModelRequest withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * 
     * @param mLModelName
     *        A user-supplied name or description of the <code>MLModel</code>.
     */

    public void setMLModelName(String mLModelName) {
        this.mLModelName = mLModelName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the <code>MLModel</code>.
     */

    public String getMLModelName() {
        return this.mLModelName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * 
     * @param mLModelName
     *        A user-supplied name or description of the <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLModelRequest withMLModelName(String mLModelName) {
        setMLModelName(mLModelName);
        return this;
    }

    /**
     * <p>
     * The category of supervised learning that this <code>MLModel</code> will address. Choose from the following types:
     * </p>
     * <ul>
     * <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     * <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     * <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     * </ul>
     * <p>
     * For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine
     * Learning Developer Guide</a>.
     * </p>
     * 
     * @param mLModelType
     *        The category of supervised learning that this <code>MLModel</code> will address. Choose from the following
     *        types:</p>
     *        <ul>
     *        <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     *        <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     *        <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     *        </ul>
     *        <p>
     *        For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *        Machine Learning Developer Guide</a>.
     * @see MLModelType
     */

    public void setMLModelType(String mLModelType) {
        this.mLModelType = mLModelType;
    }

    /**
     * <p>
     * The category of supervised learning that this <code>MLModel</code> will address. Choose from the following types:
     * </p>
     * <ul>
     * <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     * <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     * <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     * </ul>
     * <p>
     * For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine
     * Learning Developer Guide</a>.
     * </p>
     * 
     * @return The category of supervised learning that this <code>MLModel</code> will address. Choose from the
     *         following types:</p>
     *         <ul>
     *         <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     *         <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     *         <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     *         </ul>
     *         <p>
     *         For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *         Machine Learning Developer Guide</a>.
     * @see MLModelType
     */

    public String getMLModelType() {
        return this.mLModelType;
    }

    /**
     * <p>
     * The category of supervised learning that this <code>MLModel</code> will address. Choose from the following types:
     * </p>
     * <ul>
     * <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     * <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     * <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     * </ul>
     * <p>
     * For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine
     * Learning Developer Guide</a>.
     * </p>
     * 
     * @param mLModelType
     *        The category of supervised learning that this <code>MLModel</code> will address. Choose from the following
     *        types:</p>
     *        <ul>
     *        <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     *        <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     *        <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     *        </ul>
     *        <p>
     *        For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *        Machine Learning Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MLModelType
     */

    public CreateMLModelRequest withMLModelType(String mLModelType) {
        setMLModelType(mLModelType);
        return this;
    }

    /**
     * <p>
     * The category of supervised learning that this <code>MLModel</code> will address. Choose from the following types:
     * </p>
     * <ul>
     * <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     * <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     * <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     * </ul>
     * <p>
     * For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine
     * Learning Developer Guide</a>.
     * </p>
     * 
     * @param mLModelType
     *        The category of supervised learning that this <code>MLModel</code> will address. Choose from the following
     *        types:</p>
     *        <ul>
     *        <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     *        <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     *        <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     *        </ul>
     *        <p>
     *        For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *        Machine Learning Developer Guide</a>.
     * @see MLModelType
     */

    public void setMLModelType(MLModelType mLModelType) {
        withMLModelType(mLModelType);
    }

    /**
     * <p>
     * The category of supervised learning that this <code>MLModel</code> will address. Choose from the following types:
     * </p>
     * <ul>
     * <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     * <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     * <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     * </ul>
     * <p>
     * For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine
     * Learning Developer Guide</a>.
     * </p>
     * 
     * @param mLModelType
     *        The category of supervised learning that this <code>MLModel</code> will address. Choose from the following
     *        types:</p>
     *        <ul>
     *        <li>Choose <code>REGRESSION</code> if the <code>MLModel</code> will be used to predict a numeric value.</li>
     *        <li>Choose <code>BINARY</code> if the <code>MLModel</code> result has two possible values.</li>
     *        <li>Choose <code>MULTICLASS</code> if the <code>MLModel</code> result has a limited number of values.</li>
     *        </ul>
     *        <p>
     *        For more information, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *        Machine Learning Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MLModelType
     */

    public CreateMLModelRequest withMLModelType(MLModelType mLModelType) {
        this.mLModelType = mLModelType.toString();
        return this;
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of key-value
     * pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input data, the
     * size of the model might affect its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value is
     * <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to build
     * the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to <code>10000</code>. The
     * default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling the data improves a
     * model's ability to find the optimal solution for a variety of data types. The valid values are <code>auto</code>
     * and <code>none</code>. The default value is <code>none</code>. We <?oxy_insert_start author="laurama"
     * timestamp="20160329T131121-0700">strongly recommend that you shuffle your data.<?oxy_insert_end>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L1
     * normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this
     * parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L2
     * normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of
     *         key-value pairs.</p>
     *         <p>
     *         The following is the current set of training parameters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input
     *         data, the size of the model might affect its performance.
     *         </p>
     *         <p>
     *         The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default
     *         value is <code>33554432</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to
     *         build the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to
     *         <code>10000</code>. The default value is <code>10</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling the data improves
     *         a model's ability to find the optimal solution for a variety of data types. The valid values are
     *         <code>auto</code> and <code>none</code>. The default value is <code>none</code>. We <?oxy_insert_start
     *         author="laurama" timestamp="20160329T131121-0700">strongly recommend that you shuffle your
     *         data.<?oxy_insert_end>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting
     *         the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a
     *         sparse feature set. If you use this parameter, start by specifying a small value, such as
     *         <code>1.0E-08</code>.
     *         </p>
     *         <p>
     *         The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *         use L1 normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter
     *         sparingly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting
     *         the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If
     *         you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     *         </p>
     *         <p>
     *         The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *         use L2 normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter
     *         sparingly.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return parameters;
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of key-value
     * pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input data, the
     * size of the model might affect its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value is
     * <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to build
     * the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to <code>10000</code>. The
     * default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling the data improves a
     * model's ability to find the optimal solution for a variety of data types. The valid values are <code>auto</code>
     * and <code>none</code>. The default value is <code>none</code>. We <?oxy_insert_start author="laurama"
     * timestamp="20160329T131121-0700">strongly recommend that you shuffle your data.<?oxy_insert_end>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L1
     * normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this
     * parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L2
     * normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parameters
     *        A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of
     *        key-value pairs.</p>
     *        <p>
     *        The following is the current set of training parameters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input
     *        data, the size of the model might affect its performance.
     *        </p>
     *        <p>
     *        The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value
     *        is <code>33554432</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to
     *        build the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to
     *        <code>10000</code>. The default value is <code>10</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling the data improves a
     *        model's ability to find the optimal solution for a variety of data types. The valid values are
     *        <code>auto</code> and <code>none</code>. The default value is <code>none</code>. We <?oxy_insert_start
     *        author="laurama" timestamp="20160329T131121-0700">strongly recommend that you shuffle your
     *        data.<?oxy_insert_end>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting
     *        the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse
     *        feature set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     *        </p>
     *        <p>
     *        The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *        use L1 normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter
     *        sparingly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting
     *        the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If
     *        you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     *        </p>
     *        <p>
     *        The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *        use L2 normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter
     *        sparingly.
     *        </p>
     *        </li>
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(parameters);
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of key-value
     * pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input data, the
     * size of the model might affect its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value is
     * <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to build
     * the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to <code>10000</code>. The
     * default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling the data improves a
     * model's ability to find the optimal solution for a variety of data types. The valid values are <code>auto</code>
     * and <code>none</code>. The default value is <code>none</code>. We <?oxy_insert_start author="laurama"
     * timestamp="20160329T131121-0700">strongly recommend that you shuffle your data.<?oxy_insert_end>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature
     * set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L1
     * normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting the
     * data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this
     * parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not use L2
     * normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter sparingly.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parameters
     *        A list of the training parameters in the <code>MLModel</code>. The list is implemented as a map of
     *        key-value pairs.</p>
     *        <p>
     *        The following is the current set of training parameters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the model. Depending on the input
     *        data, the size of the model might affect its performance.
     *        </p>
     *        <p>
     *        The value is an integer that ranges from <code>100000</code> to <code>2147483648</code>. The default value
     *        is <code>33554432</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.maxPasses</code> - The number of times that the training process traverses the observations to
     *        build the <code>MLModel</code>. The value is an integer that ranges from <code>1</code> to
     *        <code>10000</code>. The default value is <code>10</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training data. Shuffling the data improves a
     *        model's ability to find the optimal solution for a variety of data types. The valid values are
     *        <code>auto</code> and <code>none</code>. The default value is <code>none</code>. We <?oxy_insert_start
     *        author="laurama" timestamp="20160329T131121-0700">strongly recommend that you shuffle your
     *        data.<?oxy_insert_end>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.l1RegularizationAmount</code> - The coefficient regularization L1 norm. It controls overfitting
     *        the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse
     *        feature set. If you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     *        </p>
     *        <p>
     *        The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *        use L1 normalization. This parameter can't be used when <code>L2</code> is specified. Use this parameter
     *        sparingly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sgd.l2RegularizationAmount</code> - The coefficient regularization L2 norm. It controls overfitting
     *        the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If
     *        you use this parameter, start by specifying a small value, such as <code>1.0E-08</code>.
     *        </p>
     *        <p>
     *        The value is a double that ranges from <code>0</code> to <code>MAX_DOUBLE</code>. The default is to not
     *        use L2 normalization. This parameter can't be used when <code>L1</code> is specified. Use this parameter
     *        sparingly.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLModelRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public CreateMLModelRequest addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLModelRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The <code>DataSource</code> that points to the training data.
     * </p>
     * 
     * @param trainingDataSourceId
     *        The <code>DataSource</code> that points to the training data.
     */

    public void setTrainingDataSourceId(String trainingDataSourceId) {
        this.trainingDataSourceId = trainingDataSourceId;
    }

    /**
     * <p>
     * The <code>DataSource</code> that points to the training data.
     * </p>
     * 
     * @return The <code>DataSource</code> that points to the training data.
     */

    public String getTrainingDataSourceId() {
        return this.trainingDataSourceId;
    }

    /**
     * <p>
     * The <code>DataSource</code> that points to the training data.
     * </p>
     * 
     * @param trainingDataSourceId
     *        The <code>DataSource</code> that points to the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLModelRequest withTrainingDataSourceId(String trainingDataSourceId) {
        setTrainingDataSourceId(trainingDataSourceId);
        return this;
    }

    /**
     * <p>
     * The data recipe for creating the <code>MLModel</code>. You must specify either the recipe or its URI. If you
     * don't specify a recipe or its URI, Amazon ML creates a default.
     * </p>
     * 
     * @param recipe
     *        The data recipe for creating the <code>MLModel</code>. You must specify either the recipe or its URI. If
     *        you don't specify a recipe or its URI, Amazon ML creates a default.
     */

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    /**
     * <p>
     * The data recipe for creating the <code>MLModel</code>. You must specify either the recipe or its URI. If you
     * don't specify a recipe or its URI, Amazon ML creates a default.
     * </p>
     * 
     * @return The data recipe for creating the <code>MLModel</code>. You must specify either the recipe or its URI. If
     *         you don't specify a recipe or its URI, Amazon ML creates a default.
     */

    public String getRecipe() {
        return this.recipe;
    }

    /**
     * <p>
     * The data recipe for creating the <code>MLModel</code>. You must specify either the recipe or its URI. If you
     * don't specify a recipe or its URI, Amazon ML creates a default.
     * </p>
     * 
     * @param recipe
     *        The data recipe for creating the <code>MLModel</code>. You must specify either the recipe or its URI. If
     *        you don't specify a recipe or its URI, Amazon ML creates a default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLModelRequest withRecipe(String recipe) {
        setRecipe(recipe);
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) location and file name that contains the <code>MLModel</code>
     * recipe. You must specify either the recipe or its URI. If you don't specify a recipe or its URI, Amazon ML
     * creates a default.
     * </p>
     * 
     * @param recipeUri
     *        The Amazon Simple Storage Service (Amazon S3) location and file name that contains the
     *        <code>MLModel</code> recipe. You must specify either the recipe or its URI. If you don't specify a recipe
     *        or its URI, Amazon ML creates a default.
     */

    public void setRecipeUri(String recipeUri) {
        this.recipeUri = recipeUri;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) location and file name that contains the <code>MLModel</code>
     * recipe. You must specify either the recipe or its URI. If you don't specify a recipe or its URI, Amazon ML
     * creates a default.
     * </p>
     * 
     * @return The Amazon Simple Storage Service (Amazon S3) location and file name that contains the
     *         <code>MLModel</code> recipe. You must specify either the recipe or its URI. If you don't specify a recipe
     *         or its URI, Amazon ML creates a default.
     */

    public String getRecipeUri() {
        return this.recipeUri;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) location and file name that contains the <code>MLModel</code>
     * recipe. You must specify either the recipe or its URI. If you don't specify a recipe or its URI, Amazon ML
     * creates a default.
     * </p>
     * 
     * @param recipeUri
     *        The Amazon Simple Storage Service (Amazon S3) location and file name that contains the
     *        <code>MLModel</code> recipe. You must specify either the recipe or its URI. If you don't specify a recipe
     *        or its URI, Amazon ML creates a default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLModelRequest withRecipeUri(String recipeUri) {
        setRecipeUri(recipeUri);
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
        if (getMLModelId() != null)
            sb.append("MLModelId: ").append(getMLModelId()).append(",");
        if (getMLModelName() != null)
            sb.append("MLModelName: ").append(getMLModelName()).append(",");
        if (getMLModelType() != null)
            sb.append("MLModelType: ").append(getMLModelType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTrainingDataSourceId() != null)
            sb.append("TrainingDataSourceId: ").append(getTrainingDataSourceId()).append(",");
        if (getRecipe() != null)
            sb.append("Recipe: ").append(getRecipe()).append(",");
        if (getRecipeUri() != null)
            sb.append("RecipeUri: ").append(getRecipeUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMLModelRequest == false)
            return false;
        CreateMLModelRequest other = (CreateMLModelRequest) obj;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getMLModelName() == null ^ this.getMLModelName() == null)
            return false;
        if (other.getMLModelName() != null && other.getMLModelName().equals(this.getMLModelName()) == false)
            return false;
        if (other.getMLModelType() == null ^ this.getMLModelType() == null)
            return false;
        if (other.getMLModelType() != null && other.getMLModelType().equals(this.getMLModelType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTrainingDataSourceId() == null ^ this.getTrainingDataSourceId() == null)
            return false;
        if (other.getTrainingDataSourceId() != null && other.getTrainingDataSourceId().equals(this.getTrainingDataSourceId()) == false)
            return false;
        if (other.getRecipe() == null ^ this.getRecipe() == null)
            return false;
        if (other.getRecipe() != null && other.getRecipe().equals(this.getRecipe()) == false)
            return false;
        if (other.getRecipeUri() == null ^ this.getRecipeUri() == null)
            return false;
        if (other.getRecipeUri() != null && other.getRecipeUri().equals(this.getRecipeUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime * hashCode + ((getMLModelName() == null) ? 0 : getMLModelName().hashCode());
        hashCode = prime * hashCode + ((getMLModelType() == null) ? 0 : getMLModelType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataSourceId() == null) ? 0 : getTrainingDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getRecipe() == null) ? 0 : getRecipe().hashCode());
        hashCode = prime * hashCode + ((getRecipeUri() == null) ? 0 : getRecipeUri().hashCode());
        return hashCode;
    }

    @Override
    public CreateMLModelRequest clone() {
        return (CreateMLModelRequest) super.clone();
    }

}
