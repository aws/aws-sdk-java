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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/EvaluateCode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateCodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The runtime to be used when evaluating the code. Currently, only the <code>APPSYNC_JS</code> runtime is
     * supported.
     * </p>
     */
    private AppSyncRuntime runtime;
    /**
     * <p>
     * The code definition to be evaluated. Note that <code>code</code> and <code>runtime</code> are both required for
     * this action. The <code>runtime</code> value must be <code>APPSYNC_JS</code>.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The map that holds all of the contextual information for your resolver invocation. A <code>context</code> is
     * required for this action.
     * </p>
     */
    private String context;
    /**
     * <p>
     * The function within the code to be evaluated. If provided, the valid values are <code>request</code> and
     * <code>response</code>.
     * </p>
     */
    private String function;

    /**
     * <p>
     * The runtime to be used when evaluating the code. Currently, only the <code>APPSYNC_JS</code> runtime is
     * supported.
     * </p>
     * 
     * @param runtime
     *        The runtime to be used when evaluating the code. Currently, only the <code>APPSYNC_JS</code> runtime is
     *        supported.
     */

    public void setRuntime(AppSyncRuntime runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The runtime to be used when evaluating the code. Currently, only the <code>APPSYNC_JS</code> runtime is
     * supported.
     * </p>
     * 
     * @return The runtime to be used when evaluating the code. Currently, only the <code>APPSYNC_JS</code> runtime is
     *         supported.
     */

    public AppSyncRuntime getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The runtime to be used when evaluating the code. Currently, only the <code>APPSYNC_JS</code> runtime is
     * supported.
     * </p>
     * 
     * @param runtime
     *        The runtime to be used when evaluating the code. Currently, only the <code>APPSYNC_JS</code> runtime is
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateCodeRequest withRuntime(AppSyncRuntime runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The code definition to be evaluated. Note that <code>code</code> and <code>runtime</code> are both required for
     * this action. The <code>runtime</code> value must be <code>APPSYNC_JS</code>.
     * </p>
     * 
     * @param code
     *        The code definition to be evaluated. Note that <code>code</code> and <code>runtime</code> are both
     *        required for this action. The <code>runtime</code> value must be <code>APPSYNC_JS</code>.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code definition to be evaluated. Note that <code>code</code> and <code>runtime</code> are both required for
     * this action. The <code>runtime</code> value must be <code>APPSYNC_JS</code>.
     * </p>
     * 
     * @return The code definition to be evaluated. Note that <code>code</code> and <code>runtime</code> are both
     *         required for this action. The <code>runtime</code> value must be <code>APPSYNC_JS</code>.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code definition to be evaluated. Note that <code>code</code> and <code>runtime</code> are both required for
     * this action. The <code>runtime</code> value must be <code>APPSYNC_JS</code>.
     * </p>
     * 
     * @param code
     *        The code definition to be evaluated. Note that <code>code</code> and <code>runtime</code> are both
     *        required for this action. The <code>runtime</code> value must be <code>APPSYNC_JS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateCodeRequest withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The map that holds all of the contextual information for your resolver invocation. A <code>context</code> is
     * required for this action.
     * </p>
     * 
     * @param context
     *        The map that holds all of the contextual information for your resolver invocation. A <code>context</code>
     *        is required for this action.
     */

    public void setContext(String context) {
        this.context = context;
    }

    /**
     * <p>
     * The map that holds all of the contextual information for your resolver invocation. A <code>context</code> is
     * required for this action.
     * </p>
     * 
     * @return The map that holds all of the contextual information for your resolver invocation. A <code>context</code>
     *         is required for this action.
     */

    public String getContext() {
        return this.context;
    }

    /**
     * <p>
     * The map that holds all of the contextual information for your resolver invocation. A <code>context</code> is
     * required for this action.
     * </p>
     * 
     * @param context
     *        The map that holds all of the contextual information for your resolver invocation. A <code>context</code>
     *        is required for this action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateCodeRequest withContext(String context) {
        setContext(context);
        return this;
    }

    /**
     * <p>
     * The function within the code to be evaluated. If provided, the valid values are <code>request</code> and
     * <code>response</code>.
     * </p>
     * 
     * @param function
     *        The function within the code to be evaluated. If provided, the valid values are <code>request</code> and
     *        <code>response</code>.
     */

    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * <p>
     * The function within the code to be evaluated. If provided, the valid values are <code>request</code> and
     * <code>response</code>.
     * </p>
     * 
     * @return The function within the code to be evaluated. If provided, the valid values are <code>request</code> and
     *         <code>response</code>.
     */

    public String getFunction() {
        return this.function;
    }

    /**
     * <p>
     * The function within the code to be evaluated. If provided, the valid values are <code>request</code> and
     * <code>response</code>.
     * </p>
     * 
     * @param function
     *        The function within the code to be evaluated. If provided, the valid values are <code>request</code> and
     *        <code>response</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateCodeRequest withFunction(String function) {
        setFunction(function);
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
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getFunction() != null)
            sb.append("Function: ").append(getFunction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluateCodeRequest == false)
            return false;
        EvaluateCodeRequest other = (EvaluateCodeRequest) obj;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getFunction() == null ^ this.getFunction() == null)
            return false;
        if (other.getFunction() != null && other.getFunction().equals(this.getFunction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getFunction() == null) ? 0 : getFunction().hashCode());
        return hashCode;
    }

    @Override
    public EvaluateCodeRequest clone() {
        return (EvaluateCodeRequest) super.clone();
    }

}
