/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#createMLModel(CreateMLModelRequest) CreateMLModel operation}.
 * <p>
 * Creates a new <code>MLModel</code> using the data files and the recipe
 * as information sources.
 * </p>
 * <p>
 * An <code>MLModel</code> is nearly immutable. Users can only update the
 * <code>MLModelName</code> and the <code>ScoreThreshold</code> in an
 * <code>MLModel</code> without creating a new <code>MLModel</code> .
 * 
 * </p>
 * <p>
 * <code>CreateMLModel</code> is an asynchronous operation. In response
 * to <code>CreateMLModel</code> , Amazon Machine Learning (Amazon ML)
 * immediately returns and sets the <code>MLModel</code> status to
 * <code>PENDING</code> . After the <code>MLModel</code> is created and
 * ready for use, Amazon ML sets the status to <code>COMPLETED</code> .
 * 
 * </p>
 * <p>
 * You can use the GetMLModel operation to check progress of the
 * <code>MLModel</code> during the creation operation.
 * </p>
 * <p>
 * CreateMLModel requires a <code>DataSource</code> with computed
 * statistics, which can be created by setting
 * <code>ComputeStatistics</code> to <code>true</code> in
 * CreateDataSourceFromRDS, CreateDataSourceFromS3, or
 * CreateDataSourceFromRedshift operations.
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#createMLModel(CreateMLModelRequest)
 */
public class CreateMLModelRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     */
    private String mLModelName;

    /**
     * The category of supervised learning that this <code>MLModel</code>
     * will address. Choose from the following types: <ul> <li>Choose
     * <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     * predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     * <code>MLModel</code> result has two possible values.</li> <li>Choose
     * <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     * limited number of values. </li> </ul> <p> For more information, see
     * the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     */
    private String mLModelType;

    /**
     * A list of the training parameters in the <code>MLModel</code>. The
     * list is implemented as a map of key/value pairs. <p>The following is
     * the current set of training parameters: <ul>
     * <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     * regularization L1 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to zero,
     * resulting in sparse feature set. If you use this parameter, start by
     * specifying a small value such as 1.0E-08. <p>The value is a double
     * that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     * normalization. The parameter cannot be used when <code>L2</code> is
     * specified. Use this parameter sparingly.</li>
     * <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     * regularization L2 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to small, nonzero
     * values. If you use this parameter, start by specifying a small value
     * such as 1.0E-08. <p>The valuseis a double that ranges from 0 to
     * MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     * used when <code>L1</code> is specified. Use this parameter
     * sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     * that the training process traverses the observations to build the
     * <code>MLModel</code>. The value is an integer that ranges from 1 to
     * 10000. The default value is 10. </li>
     * <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     * of the model. Depending on the input data, the size of the model might
     * affect its performance. <p> The value is an integer that ranges from
     * 100000 to 2147483648. The default value is 33554432. </li> </ul>
     */
    private java.util.Map<String,String> parameters;

    /**
     * The <code>DataSource</code> that points to the training data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String trainingDataSourceId;

    /**
     * The data recipe for creating <code>MLModel</code>. You must specify
     * either the recipe or its URI. If you don???t specify a recipe or its
     * URI, Amazon ML creates a default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     */
    private String recipe;

    /**
     * The Amazon Simple Storage Service (Amazon S3) location and file name
     * that contains the <code>MLModel</code> recipe. You must specify either
     * the recipe or its URI. If you don???t specify a recipe or its URI,
     * Amazon ML creates a default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String recipeUri;

    /**
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     */
    public String getMLModelId() {
        return mLModelId;
    }
    
    /**
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }
    
    /**
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMLModelRequest withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @return A user-supplied name or description of the <code>MLModel</code>.
     */
    public String getMLModelName() {
        return mLModelName;
    }
    
    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param mLModelName A user-supplied name or description of the <code>MLModel</code>.
     */
    public void setMLModelName(String mLModelName) {
        this.mLModelName = mLModelName;
    }
    
    /**
     * A user-supplied name or description of the <code>MLModel</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*\S.*|^$<br/>
     *
     * @param mLModelName A user-supplied name or description of the <code>MLModel</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMLModelRequest withMLModelName(String mLModelName) {
        this.mLModelName = mLModelName;
        return this;
    }

    /**
     * The category of supervised learning that this <code>MLModel</code>
     * will address. Choose from the following types: <ul> <li>Choose
     * <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     * predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     * <code>MLModel</code> result has two possible values.</li> <li>Choose
     * <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     * limited number of values. </li> </ul> <p> For more information, see
     * the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @return The category of supervised learning that this <code>MLModel</code>
     *         will address. Choose from the following types: <ul> <li>Choose
     *         <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     *         predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     *         <code>MLModel</code> result has two possible values.</li> <li>Choose
     *         <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     *         limited number of values. </li> </ul> <p> For more information, see
     *         the <a
     *         href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *         Machine Learning Developer Guide</a>.
     *
     * @see MLModelType
     */
    public String getMLModelType() {
        return mLModelType;
    }
    
    /**
     * The category of supervised learning that this <code>MLModel</code>
     * will address. Choose from the following types: <ul> <li>Choose
     * <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     * predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     * <code>MLModel</code> result has two possible values.</li> <li>Choose
     * <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     * limited number of values. </li> </ul> <p> For more information, see
     * the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType The category of supervised learning that this <code>MLModel</code>
     *         will address. Choose from the following types: <ul> <li>Choose
     *         <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     *         predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     *         <code>MLModel</code> result has two possible values.</li> <li>Choose
     *         <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     *         limited number of values. </li> </ul> <p> For more information, see
     *         the <a
     *         href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *         Machine Learning Developer Guide</a>.
     *
     * @see MLModelType
     */
    public void setMLModelType(String mLModelType) {
        this.mLModelType = mLModelType;
    }
    
    /**
     * The category of supervised learning that this <code>MLModel</code>
     * will address. Choose from the following types: <ul> <li>Choose
     * <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     * predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     * <code>MLModel</code> result has two possible values.</li> <li>Choose
     * <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     * limited number of values. </li> </ul> <p> For more information, see
     * the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType The category of supervised learning that this <code>MLModel</code>
     *         will address. Choose from the following types: <ul> <li>Choose
     *         <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     *         predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     *         <code>MLModel</code> result has two possible values.</li> <li>Choose
     *         <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     *         limited number of values. </li> </ul> <p> For more information, see
     *         the <a
     *         href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *         Machine Learning Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MLModelType
     */
    public CreateMLModelRequest withMLModelType(String mLModelType) {
        this.mLModelType = mLModelType;
        return this;
    }

    /**
     * The category of supervised learning that this <code>MLModel</code>
     * will address. Choose from the following types: <ul> <li>Choose
     * <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     * predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     * <code>MLModel</code> result has two possible values.</li> <li>Choose
     * <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     * limited number of values. </li> </ul> <p> For more information, see
     * the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType The category of supervised learning that this <code>MLModel</code>
     *         will address. Choose from the following types: <ul> <li>Choose
     *         <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     *         predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     *         <code>MLModel</code> result has two possible values.</li> <li>Choose
     *         <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     *         limited number of values. </li> </ul> <p> For more information, see
     *         the <a
     *         href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *         Machine Learning Developer Guide</a>.
     *
     * @see MLModelType
     */
    public void setMLModelType(MLModelType mLModelType) {
        this.mLModelType = mLModelType.toString();
    }
    
    /**
     * The category of supervised learning that this <code>MLModel</code>
     * will address. Choose from the following types: <ul> <li>Choose
     * <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     * predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     * <code>MLModel</code> result has two possible values.</li> <li>Choose
     * <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     * limited number of values. </li> </ul> <p> For more information, see
     * the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType The category of supervised learning that this <code>MLModel</code>
     *         will address. Choose from the following types: <ul> <li>Choose
     *         <code>REGRESSION</code> if the <code>MLModel</code> will be used to
     *         predict a numeric value.</li> <li>Choose <code>BINARY</code> if the
     *         <code>MLModel</code> result has two possible values.</li> <li>Choose
     *         <code>MULTICLASS</code> if the <code>MLModel</code> result has a
     *         limited number of values. </li> </ul> <p> For more information, see
     *         the <a
     *         href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *         Machine Learning Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MLModelType
     */
    public CreateMLModelRequest withMLModelType(MLModelType mLModelType) {
        this.mLModelType = mLModelType.toString();
        return this;
    }

    /**
     * A list of the training parameters in the <code>MLModel</code>. The
     * list is implemented as a map of key/value pairs. <p>The following is
     * the current set of training parameters: <ul>
     * <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     * regularization L1 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to zero,
     * resulting in sparse feature set. If you use this parameter, start by
     * specifying a small value such as 1.0E-08. <p>The value is a double
     * that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     * normalization. The parameter cannot be used when <code>L2</code> is
     * specified. Use this parameter sparingly.</li>
     * <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     * regularization L2 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to small, nonzero
     * values. If you use this parameter, start by specifying a small value
     * such as 1.0E-08. <p>The valuseis a double that ranges from 0 to
     * MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     * used when <code>L1</code> is specified. Use this parameter
     * sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     * that the training process traverses the observations to build the
     * <code>MLModel</code>. The value is an integer that ranges from 1 to
     * 10000. The default value is 10. </li>
     * <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     * of the model. Depending on the input data, the size of the model might
     * affect its performance. <p> The value is an integer that ranges from
     * 100000 to 2147483648. The default value is 33554432. </li> </ul>
     *
     * @return A list of the training parameters in the <code>MLModel</code>. The
     *         list is implemented as a map of key/value pairs. <p>The following is
     *         the current set of training parameters: <ul>
     *         <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     *         regularization L1 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to zero,
     *         resulting in sparse feature set. If you use this parameter, start by
     *         specifying a small value such as 1.0E-08. <p>The value is a double
     *         that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     *         normalization. The parameter cannot be used when <code>L2</code> is
     *         specified. Use this parameter sparingly.</li>
     *         <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     *         regularization L2 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to small, nonzero
     *         values. If you use this parameter, start by specifying a small value
     *         such as 1.0E-08. <p>The valuseis a double that ranges from 0 to
     *         MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     *         used when <code>L1</code> is specified. Use this parameter
     *         sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     *         that the training process traverses the observations to build the
     *         <code>MLModel</code>. The value is an integer that ranges from 1 to
     *         10000. The default value is 10. </li>
     *         <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     *         of the model. Depending on the input data, the size of the model might
     *         affect its performance. <p> The value is an integer that ranges from
     *         100000 to 2147483648. The default value is 33554432. </li> </ul>
     */
    public java.util.Map<String,String> getParameters() {
        
        if (parameters == null) {
            parameters = new java.util.HashMap<String,String>();
        }
        return parameters;
    }
    
    /**
     * A list of the training parameters in the <code>MLModel</code>. The
     * list is implemented as a map of key/value pairs. <p>The following is
     * the current set of training parameters: <ul>
     * <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     * regularization L1 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to zero,
     * resulting in sparse feature set. If you use this parameter, start by
     * specifying a small value such as 1.0E-08. <p>The value is a double
     * that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     * normalization. The parameter cannot be used when <code>L2</code> is
     * specified. Use this parameter sparingly.</li>
     * <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     * regularization L2 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to small, nonzero
     * values. If you use this parameter, start by specifying a small value
     * such as 1.0E-08. <p>The valuseis a double that ranges from 0 to
     * MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     * used when <code>L1</code> is specified. Use this parameter
     * sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     * that the training process traverses the observations to build the
     * <code>MLModel</code>. The value is an integer that ranges from 1 to
     * 10000. The default value is 10. </li>
     * <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     * of the model. Depending on the input data, the size of the model might
     * affect its performance. <p> The value is an integer that ranges from
     * 100000 to 2147483648. The default value is 33554432. </li> </ul>
     *
     * @param parameters A list of the training parameters in the <code>MLModel</code>. The
     *         list is implemented as a map of key/value pairs. <p>The following is
     *         the current set of training parameters: <ul>
     *         <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     *         regularization L1 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to zero,
     *         resulting in sparse feature set. If you use this parameter, start by
     *         specifying a small value such as 1.0E-08. <p>The value is a double
     *         that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     *         normalization. The parameter cannot be used when <code>L2</code> is
     *         specified. Use this parameter sparingly.</li>
     *         <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     *         regularization L2 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to small, nonzero
     *         values. If you use this parameter, start by specifying a small value
     *         such as 1.0E-08. <p>The valuseis a double that ranges from 0 to
     *         MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     *         used when <code>L1</code> is specified. Use this parameter
     *         sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     *         that the training process traverses the observations to build the
     *         <code>MLModel</code>. The value is an integer that ranges from 1 to
     *         10000. The default value is 10. </li>
     *         <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     *         of the model. Depending on the input data, the size of the model might
     *         affect its performance. <p> The value is an integer that ranges from
     *         100000 to 2147483648. The default value is 33554432. </li> </ul>
     */
    public void setParameters(java.util.Map<String,String> parameters) {
        this.parameters = parameters;
    }
    
    /**
     * A list of the training parameters in the <code>MLModel</code>. The
     * list is implemented as a map of key/value pairs. <p>The following is
     * the current set of training parameters: <ul>
     * <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     * regularization L1 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to zero,
     * resulting in sparse feature set. If you use this parameter, start by
     * specifying a small value such as 1.0E-08. <p>The value is a double
     * that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     * normalization. The parameter cannot be used when <code>L2</code> is
     * specified. Use this parameter sparingly.</li>
     * <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     * regularization L2 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to small, nonzero
     * values. If you use this parameter, start by specifying a small value
     * such as 1.0E-08. <p>The valuseis a double that ranges from 0 to
     * MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     * used when <code>L1</code> is specified. Use this parameter
     * sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     * that the training process traverses the observations to build the
     * <code>MLModel</code>. The value is an integer that ranges from 1 to
     * 10000. The default value is 10. </li>
     * <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     * of the model. Depending on the input data, the size of the model might
     * affect its performance. <p> The value is an integer that ranges from
     * 100000 to 2147483648. The default value is 33554432. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of the training parameters in the <code>MLModel</code>. The
     *         list is implemented as a map of key/value pairs. <p>The following is
     *         the current set of training parameters: <ul>
     *         <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     *         regularization L1 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to zero,
     *         resulting in sparse feature set. If you use this parameter, start by
     *         specifying a small value such as 1.0E-08. <p>The value is a double
     *         that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     *         normalization. The parameter cannot be used when <code>L2</code> is
     *         specified. Use this parameter sparingly.</li>
     *         <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     *         regularization L2 norm. It controls overfitting the data by penalizing
     *         large coefficients. This tends to drive coefficients to small, nonzero
     *         values. If you use this parameter, start by specifying a small value
     *         such as 1.0E-08. <p>The valuseis a double that ranges from 0 to
     *         MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     *         used when <code>L1</code> is specified. Use this parameter
     *         sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     *         that the training process traverses the observations to build the
     *         <code>MLModel</code>. The value is an integer that ranges from 1 to
     *         10000. The default value is 10. </li>
     *         <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     *         of the model. Depending on the input data, the size of the model might
     *         affect its performance. <p> The value is an integer that ranges from
     *         100000 to 2147483648. The default value is 33554432. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMLModelRequest withParameters(java.util.Map<String,String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * A list of the training parameters in the <code>MLModel</code>. The
     * list is implemented as a map of key/value pairs. <p>The following is
     * the current set of training parameters: <ul>
     * <li><p><code>sgd.l1RegularizationAmount</code> - Coefficient
     * regularization L1 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to zero,
     * resulting in sparse feature set. If you use this parameter, start by
     * specifying a small value such as 1.0E-08. <p>The value is a double
     * that ranges from 0 to MAX_DOUBLE. The default is not to use L1
     * normalization. The parameter cannot be used when <code>L2</code> is
     * specified. Use this parameter sparingly.</li>
     * <li><p><code>sgd.l2RegularizationAmount</code> - Coefficient
     * regularization L2 norm. It controls overfitting the data by penalizing
     * large coefficients. This tends to drive coefficients to small, nonzero
     * values. If you use this parameter, start by specifying a small value
     * such as 1.0E-08. <p>The valuseis a double that ranges from 0 to
     * MAX_DOUBLE. The default is not to use L2 normalization. This cannot be
     * used when <code>L1</code> is specified. Use this parameter
     * sparingly.</li> <li><p><code>sgd.maxPasses</code> - Number of times
     * that the training process traverses the observations to build the
     * <code>MLModel</code>. The value is an integer that ranges from 1 to
     * 10000. The default value is 10. </li>
     * <li><p><code>sgd.maxMLModelSizeInBytes</code> - Maximum allowed size
     * of the model. Depending on the input data, the size of the model might
     * affect its performance. <p> The value is an integer that ranges from
     * 100000 to 2147483648. The default value is 33554432. </li> </ul>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into Parameters.
     */
  public CreateMLModelRequest addParametersEntry(String key, String value) {
    if (null == this.parameters) {
      this.parameters = new java.util.HashMap<String,String>();
    }
    if (this.parameters.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.parameters.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into Parameters.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public CreateMLModelRequest clearParametersEntries() {
    this.parameters = null;
    return this;
  }
  
    /**
     * The <code>DataSource</code> that points to the training data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The <code>DataSource</code> that points to the training data.
     */
    public String getTrainingDataSourceId() {
        return trainingDataSourceId;
    }
    
    /**
     * The <code>DataSource</code> that points to the training data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param trainingDataSourceId The <code>DataSource</code> that points to the training data.
     */
    public void setTrainingDataSourceId(String trainingDataSourceId) {
        this.trainingDataSourceId = trainingDataSourceId;
    }
    
    /**
     * The <code>DataSource</code> that points to the training data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param trainingDataSourceId The <code>DataSource</code> that points to the training data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMLModelRequest withTrainingDataSourceId(String trainingDataSourceId) {
        this.trainingDataSourceId = trainingDataSourceId;
        return this;
    }

    /**
     * The data recipe for creating <code>MLModel</code>. You must specify
     * either the recipe or its URI. If you don???t specify a recipe or its
     * URI, Amazon ML creates a default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @return The data recipe for creating <code>MLModel</code>. You must specify
     *         either the recipe or its URI. If you don???t specify a recipe or its
     *         URI, Amazon ML creates a default.
     */
    public String getRecipe() {
        return recipe;
    }
    
    /**
     * The data recipe for creating <code>MLModel</code>. You must specify
     * either the recipe or its URI. If you don???t specify a recipe or its
     * URI, Amazon ML creates a default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @param recipe The data recipe for creating <code>MLModel</code>. You must specify
     *         either the recipe or its URI. If you don???t specify a recipe or its
     *         URI, Amazon ML creates a default.
     */
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
    
    /**
     * The data recipe for creating <code>MLModel</code>. You must specify
     * either the recipe or its URI. If you don???t specify a recipe or its
     * URI, Amazon ML creates a default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 131071<br/>
     *
     * @param recipe The data recipe for creating <code>MLModel</code>. You must specify
     *         either the recipe or its URI. If you don???t specify a recipe or its
     *         URI, Amazon ML creates a default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMLModelRequest withRecipe(String recipe) {
        this.recipe = recipe;
        return this;
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location and file name
     * that contains the <code>MLModel</code> recipe. You must specify either
     * the recipe or its URI. If you don???t specify a recipe or its URI,
     * Amazon ML creates a default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return The Amazon Simple Storage Service (Amazon S3) location and file name
     *         that contains the <code>MLModel</code> recipe. You must specify either
     *         the recipe or its URI. If you don???t specify a recipe or its URI,
     *         Amazon ML creates a default.
     */
    public String getRecipeUri() {
        return recipeUri;
    }
    
    /**
     * The Amazon Simple Storage Service (Amazon S3) location and file name
     * that contains the <code>MLModel</code> recipe. You must specify either
     * the recipe or its URI. If you don???t specify a recipe or its URI,
     * Amazon ML creates a default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param recipeUri The Amazon Simple Storage Service (Amazon S3) location and file name
     *         that contains the <code>MLModel</code> recipe. You must specify either
     *         the recipe or its URI. If you don???t specify a recipe or its URI,
     *         Amazon ML creates a default.
     */
    public void setRecipeUri(String recipeUri) {
        this.recipeUri = recipeUri;
    }
    
    /**
     * The Amazon Simple Storage Service (Amazon S3) location and file name
     * that contains the <code>MLModel</code> recipe. You must specify either
     * the recipe or its URI. If you don???t specify a recipe or its URI,
     * Amazon ML creates a default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param recipeUri The Amazon Simple Storage Service (Amazon S3) location and file name
     *         that contains the <code>MLModel</code> recipe. You must specify either
     *         the recipe or its URI. If you don???t specify a recipe or its URI,
     *         Amazon ML creates a default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateMLModelRequest withRecipeUri(String recipeUri) {
        this.recipeUri = recipeUri;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMLModelId() != null) sb.append("MLModelId: " + getMLModelId() + ",");
        if (getMLModelName() != null) sb.append("MLModelName: " + getMLModelName() + ",");
        if (getMLModelType() != null) sb.append("MLModelType: " + getMLModelType() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() + ",");
        if (getTrainingDataSourceId() != null) sb.append("TrainingDataSourceId: " + getTrainingDataSourceId() + ",");
        if (getRecipe() != null) sb.append("Recipe: " + getRecipe() + ",");
        if (getRecipeUri() != null) sb.append("RecipeUri: " + getRecipeUri() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateMLModelRequest == false) return false;
        CreateMLModelRequest other = (CreateMLModelRequest)obj;
        
        if (other.getMLModelId() == null ^ this.getMLModelId() == null) return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false) return false; 
        if (other.getMLModelName() == null ^ this.getMLModelName() == null) return false;
        if (other.getMLModelName() != null && other.getMLModelName().equals(this.getMLModelName()) == false) return false; 
        if (other.getMLModelType() == null ^ this.getMLModelType() == null) return false;
        if (other.getMLModelType() != null && other.getMLModelType().equals(this.getMLModelType()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.getTrainingDataSourceId() == null ^ this.getTrainingDataSourceId() == null) return false;
        if (other.getTrainingDataSourceId() != null && other.getTrainingDataSourceId().equals(this.getTrainingDataSourceId()) == false) return false; 
        if (other.getRecipe() == null ^ this.getRecipe() == null) return false;
        if (other.getRecipe() != null && other.getRecipe().equals(this.getRecipe()) == false) return false; 
        if (other.getRecipeUri() == null ^ this.getRecipeUri() == null) return false;
        if (other.getRecipeUri() != null && other.getRecipeUri().equals(this.getRecipeUri()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateMLModelRequest clone() {
        
            return (CreateMLModelRequest) super.clone();
    }

}
    