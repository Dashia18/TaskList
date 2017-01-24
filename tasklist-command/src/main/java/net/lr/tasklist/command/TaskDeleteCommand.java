package net.lr.tasklist.command;

import net.lr.tasklist.model.Task;
import net.lr.tasklist.model.TaskService;
import org.ops4j.pax.cdi.api.OsgiService;
import org.ops4j.pax.cdi.api.OsgiServiceProvider;
import org.ops4j.pax.cdi.api.Properties;
import org.ops4j.pax.cdi.api.Property;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@OsgiServiceProvider
@Properties(//
{
 @Property(name = "osgi.command.scope", value = "task"),
 @Property(name = "osgi.command.function", value = "delete")
})
public class TaskDeleteCommand {

    @Inject @OsgiService
    TaskService taskService;

    public void delete(String id) throws Exception {
         taskService.deleteTask(id);
    }

}
