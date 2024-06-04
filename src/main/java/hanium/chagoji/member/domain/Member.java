package hanium.chagoji.member.domain;

import hanium.chagoji.common.domain.common.BaseEntity;
import hanium.chagoji.member.domain.Enum.UserStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.joda.time.DateTime;

@Entity
@Getter
@Setter
@DynamicUpdate
@DynamicInsert
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10)
    private String name;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 11)
    private String phone;

    @Column(nullable = false, length = 50)
    private String password;

//    @ManyToOne
//    @JoinColumn(name = "regidence", nullable = false)
//    private Region regidence;

    @Column(nullable = false, length = 50)
    private String regidenceDetail;

    @Column(name = "created_at", nullable = false)
    private DateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private DateTime updatedAt;

    @Column(name = "status", nullable = false, length = 15)
    private UserStatus status;
}