package guestbook;
import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.PersistenceCapable;
import java.util.Date;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable
public class Employee {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	private lock ;
	// 1차 수정하a여 commit 합니다.

}
