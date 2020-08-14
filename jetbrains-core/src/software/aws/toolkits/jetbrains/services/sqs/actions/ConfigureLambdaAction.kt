// Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0

package software.aws.toolkits.jetbrains.services.sqs.actions

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAware
import software.amazon.awssdk.services.sqs.SqsClient
import software.aws.toolkits.jetbrains.core.awsClient
import software.aws.toolkits.jetbrains.core.explorer.actions.SingleResourceNodeAction
import software.aws.toolkits.jetbrains.services.sqs.ConfigureLambdaDialog
import software.aws.toolkits.jetbrains.services.sqs.SqsQueueNode
import software.aws.toolkits.resources.message

class ConfigureLambdaAction : SingleResourceNodeAction<SqsQueueNode>(message("sqs.configure.lambda")), DumbAware {
    override fun actionPerformed(selected: SqsQueueNode, e: AnActionEvent) {
        val project = selected.nodeProject
        val client = project.awsClient<SqsClient>()
        val queue = selected.queue
        ConfigureLambdaDialog(project, client, queue).show()
    }
}
