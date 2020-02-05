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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the build input source code for this build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCodeBuildProjectSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCodeBuildProjectSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code> - The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code> - The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code> - The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code> - The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB_ENTERPRISE</code> - The source code is in a GitHub Enterprise repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_SOURCE</code> - The project does not have input source code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> - The source code is in an S3 input bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Information about the location of the source code to be built.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline, location
     * should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS CodePipeline uses
     * the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the buildspec file (for example,
     * <code>https://git-codecommit.region-ID.amazonaws.com/v1/repos/repo-name</code> ).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an S3 input bucket, one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path to the ZIP file that contains the source code (for example,
     * <code>bucket-name/path/to/object-name.zip</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The path to the folder that contains the source code (for example,
     * <code>bucket-name/path/to/source-code/folder/</code>).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file.
     * </p>
     * </li>
     * </ul>
     */
    private String location;
    /**
     * <p>
     * Information about the Git clone depth for the build project.
     * </p>
     */
    private Integer gitCloneDepth;
    /**
     * <p>
     * Whether to ignore SSL warnings while connecting to the project source code.
     * </p>
     */
    private Boolean insecureSsl;

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code> - The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code> - The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code> - The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code> - The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB_ENTERPRISE</code> - The source code is in a GitHub Enterprise repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_SOURCE</code> - The project does not have input source code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> - The source code is in an S3 input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BITBUCKET</code> - The source code is in a Bitbucket repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code> - The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code> - The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code> - The source code is in a GitHub repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB_ENTERPRISE</code> - The source code is in a GitHub Enterprise repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_SOURCE</code> - The project does not have input source code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code> - The source code is in an S3 input bucket.
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code> - The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code> - The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code> - The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code> - The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB_ENTERPRISE</code> - The source code is in a GitHub Enterprise repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_SOURCE</code> - The project does not have input source code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> - The source code is in an S3 input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of repository that contains the source code to be built. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BITBUCKET</code> - The source code is in a Bitbucket repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CODECOMMIT</code> - The source code is in an AWS CodeCommit repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CODEPIPELINE</code> - The source code settings are specified in the source action of a pipeline in
     *         AWS CodePipeline.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GITHUB</code> - The source code is in a GitHub repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GITHUB_ENTERPRISE</code> - The source code is in a GitHub Enterprise repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_SOURCE</code> - The project does not have input source code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code> - The source code is in an S3 input bucket.
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of repository that contains the source code to be built. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BITBUCKET</code> - The source code is in a Bitbucket repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODECOMMIT</code> - The source code is in an AWS CodeCommit repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code> - The source code settings are specified in the source action of a pipeline in AWS
     * CodePipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB</code> - The source code is in a GitHub repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GITHUB_ENTERPRISE</code> - The source code is in a GitHub Enterprise repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_SOURCE</code> - The project does not have input source code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code> - The source code is in an S3 input bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of repository that contains the source code to be built. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BITBUCKET</code> - The source code is in a Bitbucket repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODECOMMIT</code> - The source code is in an AWS CodeCommit repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CODEPIPELINE</code> - The source code settings are specified in the source action of a pipeline in
     *        AWS CodePipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB</code> - The source code is in a GitHub repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GITHUB_ENTERPRISE</code> - The source code is in a GitHub Enterprise repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NO_SOURCE</code> - The project does not have input source code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code> - The source code is in an S3 input bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Information about the location of the source code to be built.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline, location
     * should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS CodePipeline uses
     * the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the buildspec file (for example,
     * <code>https://git-codecommit.region-ID.amazonaws.com/v1/repos/repo-name</code> ).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an S3 input bucket, one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path to the ZIP file that contains the source code (for example,
     * <code>bucket-name/path/to/object-name.zip</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The path to the folder that contains the source code (for example,
     * <code>bucket-name/path/to/source-code/folder/</code>).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the location of the source code to be built.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *        location should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS
     *        CodePipeline uses the settings in a pipeline's source action instead of this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *        source code and the buildspec file (for example,
     *        <code>https://git-codecommit.region-ID.amazonaws.com/v1/repos/repo-name</code> ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an S3 input bucket, one of the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The path to the ZIP file that contains the source code (for example,
     *        <code>bucket-name/path/to/object-name.zip</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The path to the folder that contains the source code (for example,
     *        <code>bucket-name/path/to/source-code/folder/</code>).
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and
     *        the buildspec file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source
     *        and the buildspec file.
     *        </p>
     *        </li>
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location of the source code to be built.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline, location
     * should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS CodePipeline uses
     * the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the buildspec file (for example,
     * <code>https://git-codecommit.region-ID.amazonaws.com/v1/repos/repo-name</code> ).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an S3 input bucket, one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path to the ZIP file that contains the source code (for example,
     * <code>bucket-name/path/to/object-name.zip</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The path to the folder that contains the source code (for example,
     * <code>bucket-name/path/to/source-code/folder/</code>).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the location of the source code to be built.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *         location should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS
     *         CodePipeline uses the settings in a pipeline's source action instead of this value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *         source code and the buildspec file (for example,
     *         <code>https://git-codecommit.region-ID.amazonaws.com/v1/repos/repo-name</code> ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in an S3 input bucket, one of the following.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The path to the ZIP file that contains the source code (for example,
     *         <code>bucket-name/path/to/object-name.zip</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The path to the folder that contains the source code (for example,
     *         <code>bucket-name/path/to/source-code/folder/</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source
     *         and the buildspec file.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source
     *         and the buildspec file.
     *         </p>
     *         </li>
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the location of the source code to be built.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For source code settings that are specified in the source action of a pipeline in AWS CodePipeline, location
     * should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS CodePipeline uses
     * the settings in a pipeline's source action instead of this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source
     * code and the buildspec file (for example,
     * <code>https://git-codecommit.region-ID.amazonaws.com/v1/repos/repo-name</code> ).
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in an S3 input bucket, one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path to the ZIP file that contains the source code (for example,
     * <code>bucket-name/path/to/object-name.zip</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * The path to the folder that contains the source code (for example,
     * <code>bucket-name/path/to/source-code/folder/</code>).
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file.
     * </p>
     * </li>
     * <li>
     * <p>
     * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the
     * buildspec file.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the location of the source code to be built.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For source code settings that are specified in the source action of a pipeline in AWS CodePipeline,
     *        location should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS
     *        CodePipeline uses the settings in a pipeline's source action instead of this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the
     *        source code and the buildspec file (for example,
     *        <code>https://git-codecommit.region-ID.amazonaws.com/v1/repos/repo-name</code> ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in an S3 input bucket, one of the following.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The path to the ZIP file that contains the source code (for example,
     *        <code>bucket-name/path/to/object-name.zip</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The path to the folder that contains the source code (for example,
     *        <code>bucket-name/path/to/source-code/folder/</code>).
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and
     *        the buildspec file.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source
     *        and the buildspec file.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectSource withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Information about the Git clone depth for the build project.
     * </p>
     * 
     * @param gitCloneDepth
     *        Information about the Git clone depth for the build project.
     */

    public void setGitCloneDepth(Integer gitCloneDepth) {
        this.gitCloneDepth = gitCloneDepth;
    }

    /**
     * <p>
     * Information about the Git clone depth for the build project.
     * </p>
     * 
     * @return Information about the Git clone depth for the build project.
     */

    public Integer getGitCloneDepth() {
        return this.gitCloneDepth;
    }

    /**
     * <p>
     * Information about the Git clone depth for the build project.
     * </p>
     * 
     * @param gitCloneDepth
     *        Information about the Git clone depth for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectSource withGitCloneDepth(Integer gitCloneDepth) {
        setGitCloneDepth(gitCloneDepth);
        return this;
    }

    /**
     * <p>
     * Whether to ignore SSL warnings while connecting to the project source code.
     * </p>
     * 
     * @param insecureSsl
     *        Whether to ignore SSL warnings while connecting to the project source code.
     */

    public void setInsecureSsl(Boolean insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    /**
     * <p>
     * Whether to ignore SSL warnings while connecting to the project source code.
     * </p>
     * 
     * @return Whether to ignore SSL warnings while connecting to the project source code.
     */

    public Boolean getInsecureSsl() {
        return this.insecureSsl;
    }

    /**
     * <p>
     * Whether to ignore SSL warnings while connecting to the project source code.
     * </p>
     * 
     * @param insecureSsl
     *        Whether to ignore SSL warnings while connecting to the project source code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectSource withInsecureSsl(Boolean insecureSsl) {
        setInsecureSsl(insecureSsl);
        return this;
    }

    /**
     * <p>
     * Whether to ignore SSL warnings while connecting to the project source code.
     * </p>
     * 
     * @return Whether to ignore SSL warnings while connecting to the project source code.
     */

    public Boolean isInsecureSsl() {
        return this.insecureSsl;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getGitCloneDepth() != null)
            sb.append("GitCloneDepth: ").append(getGitCloneDepth()).append(",");
        if (getInsecureSsl() != null)
            sb.append("InsecureSsl: ").append(getInsecureSsl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCodeBuildProjectSource == false)
            return false;
        AwsCodeBuildProjectSource other = (AwsCodeBuildProjectSource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getGitCloneDepth() == null ^ this.getGitCloneDepth() == null)
            return false;
        if (other.getGitCloneDepth() != null && other.getGitCloneDepth().equals(this.getGitCloneDepth()) == false)
            return false;
        if (other.getInsecureSsl() == null ^ this.getInsecureSsl() == null)
            return false;
        if (other.getInsecureSsl() != null && other.getInsecureSsl().equals(this.getInsecureSsl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getGitCloneDepth() == null) ? 0 : getGitCloneDepth().hashCode());
        hashCode = prime * hashCode + ((getInsecureSsl() == null) ? 0 : getInsecureSsl().hashCode());
        return hashCode;
    }

    @Override
    public AwsCodeBuildProjectSource clone() {
        try {
            return (AwsCodeBuildProjectSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCodeBuildProjectSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
