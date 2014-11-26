
/**
 * Synchronous and asynchronous client classes for accessing DataPipeline.
 *
 * <p>
 * AWS Data Pipeline is a web service that configures and manages a
 * data-driven workflow called a pipeline. AWS Data Pipeline handles the
 * details of scheduling and ensuring that data dependencies are met so
 * your application can focus on processing the data.
 * </p>
 * <p>
 * The AWS Data Pipeline SDKs and CLI implements two main sets of
 * functionality. The first set of actions configure the pipeline in the
 * web service. You perform these actions to create a pipeline and define
 * data sources, schedules, dependencies, and the transforms to be
 * performed on the data.
 * </p>
 * <p>
 * The second set of actions are used by a task runner application that
 * calls the AWS Data Pipeline API to receive the next task ready for
 * processing. The logic for performing the task, such as querying the
 * data, running data analysis, or converting the data from one format to
 * another, is contained within the task runner. The task runner performs
 * the task assigned to it by the web service, reporting progress to the
 * web service as it does so. When the task is done, the task runner
 * reports the final success or failure of the task to the web service.
 * </p>
 * <p>
 * AWS Data Pipeline provides a JAR implementation of a task runner
 * called AWS Data Pipeline Task Runner. AWS Data Pipeline Task Runner
 * provides logic for common data management scenarios, such as
 * performing database queries and running data analysis using Amazon
 * Elastic MapReduce (Amazon EMR). You can use AWS Data Pipeline Task
 * Runner as your task runner, or you can write your own task runner to
 * provide custom data management.
 * </p>
 */
 package com.amazonaws.services.datapipeline;
        